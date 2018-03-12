package com.expedia.assignment.filterparameter;

import com.expedia.assignment.Validators;
import com.expedia.assignment.controller.RequestPageModel;
import com.expedia.assignment.filterparameter.exceptions.InvalidDateRange;
import com.expedia.assignment.filterparameter.exceptions.InvalidLengthOfStayException;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class RequestFilterParam {
    public static ArrayList<String> addingParams(RequestPageModel model, ArrayList<String> params) {
        Field[] fields = model.getClass().getDeclaredFields();
        String destinationType = "";
        String destination = "";
        int [] minStartDateArray= new int[]{1,2,3};
        int [] maxStartDateArray = new int[]{1,2,3};
        Validators validators= new Validators();
        validators.isStartDateLessThanEndDate(minStartDateArray,maxStartDateArray);
        validators.isMinStarLessThanOrEqualMaxStar(model.getMinStarRating(),model.getMaxTotalRating());
        validators.isMinStarLessThanOrEqualMaxStar(model.getMinGuestRating(),model.getMaxGuestRating());
        validators.isMinStarLessThanOrEqualMaxStar(model.getMinTotalRating(),model.getMaxTotalRating());
        validators.isLengthOfStayValid(model.getLengthOfStay());
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.get(model) == null || field.get(model).equals(""))
                    continue;
                if (field.getName().equals("destinationFilterType")) {
                    destinationType = field.get(model) + "";
                    continue;
                }
                if (field.getName().equals("destination")) {
                    destination = field.get(model) + "";
                    continue;
                }
                if (isNotApplicable(field.get(model) + ""))
                    continue;
                if(field.getName().toLowerCase().equals("minstartdate"))
                    minStartDateArray=(int[])field.get(model);
                if(field.getName().toLowerCase().equals("maxstartdate"))
                    minStartDateArray=(int[])field.get(model);
                if(field.getName().toLowerCase().equals("lengthofstay"))
                    validators.isLengthOfStayValid(field.get(model)+"");

                params.add(field.getName() + "=" + field.get(model));
            } catch (IllegalAccessException e) {
                e.getMessage();
            }

        }

        if (destination != null && destinationType != null)
            params.add(destinationType + "=" + destination);

        return params;
    }

    public static ArrayList<String> params(RequestPageModel model) {
//        String[] params = new String[10];
        ArrayList<String> params = new ArrayList<>();
        addingParams(model, params);
        return params;
    }

    public static boolean isNotApplicable(String value) {
        if (value.equals("N/A"))
            return true;
        return false;
    }
}
