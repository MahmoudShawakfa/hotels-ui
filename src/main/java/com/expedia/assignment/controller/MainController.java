package com.expedia.assignment.controller;

import com.expedia.assignment.filter.RequestFilter;
import com.expedia.assignment.filterparameter.RequestFilterParam;
import com.expedia.assignment.model.JSONRoot;
import com.expedia.assignment.parser.ParseJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MainController {
    @GetMapping("/welcomePage")
    public String index(Model model) {
        model.addAttribute("filter", new RequestPageModel());
        return "welcomePage";
    }

    @ExceptionHandler(RuntimeException.class)
    @PostMapping("/postPage")
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
