package com.expedia.assignment;

import com.expedia.assignment.filterparameter.exceptions.InvalidDateRange;
import com.expedia.assignment.filterparameter.exceptions.InvalidLengthOfStayException;
import com.expedia.assignment.filterparameter.exceptions.InvalidStarRange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Validators {
    public boolean isStartDateLessThanEndDate(int[] startDateArray, int[] endDateArray) {

        String startDateString = "";
        String endDateString = "";
        Calendar minStartDate = Calendar.getInstance();
        Calendar maxStartDate = Calendar.getInstance();
        minStartDate.set(startDateArray[0],startDateArray[1],startDateArray[2]);
        maxStartDate.set(endDateArray[0],endDateArray[1],endDateArray[2]);
        if (minStartDate.after(maxStartDate))
            throw new InvalidDateRange();
        return true;
    }

    public boolean isMinStarLessThanOrEqualMaxStar(String minStar, String maxStar) {
        if (minStar == null || maxStar == null)
            return true;
        if (minStar.equals( "N/A") || maxStar.equals( "N/A"))
            return true;
        if( Integer.parseInt(minStar) <= Integer.parseInt(maxStar))
            throw new InvalidStarRange();
        return true;
    }

    public static Calendar convertStringToDate(String dateString) {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
        try {
            date.setTime(sdf.parse(dateString));
        } catch (ParseException e) {
            e.getMessage();
        }
        return date;
    }

    public boolean isLengthOfStayValid(String lengthOfStay) {
        int lengthOfStayAsNumber = 0;
        if(lengthOfStay==null||lengthOfStay.equals(""))
            return true;
        if (Integer.parseInt(lengthOfStay) < 1)
            throw new InvalidLengthOfStayException();
        return true;
    }
}
