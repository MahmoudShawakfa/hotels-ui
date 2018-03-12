package com.expedia.assignment.controller;

import com.expedia.assignment.CreateRequest;
import com.expedia.assignment.RequestParams;
import com.expedia.assignment.filter.RequestFilter;
import com.expedia.assignment.filterparameter.RequestFilterParam;
import com.expedia.assignment.model.Hotel;
import com.expedia.assignment.model.JSONRoot;
import com.expedia.assignment.parser.ParseJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/welcomePage")
    public String index(Model model) {
        model.addAttribute("filter", new RequestPageModel());
        return "welcomePage";
    }

    @ExceptionHandler(RuntimeException.class)
    @RequestMapping(value = "/welcomePage", method = RequestMethod.POST)
    public String resultPost(@ModelAttribute("requestModel") RequestPageModel requestPage, Model model) {
        model.addAttribute("filter", requestPage);
        ArrayList<String> params = RequestFilterParam.params(requestPage);
        String jsonFromRequest = RequestFilter.requestFilter(params);
        ParseJson parseJson = new ParseJson(jsonFromRequest);
        JSONRoot parsedJson = parseJson.parse();
        model.addAttribute("JSONRoot", parsedJson);
        return "result";
    }

    @GetMapping("/result")
    public String resultGet(Model model) {
        return "result";
    }
}
