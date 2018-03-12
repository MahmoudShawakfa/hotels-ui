package com.expedia.validators;

import com.expedia.assignment.Validators;
import com.expedia.assignment.filterparameter.exceptions.InvalidDateRange;
import com.expedia.assignment.filterparameter.exceptions.InvalidLengthOfStayException;
import org.junit.Before;
import org.junit.Test;


public class ValidatorsTestCases {
   @Before
    public void prepare(){
        Validators validators = new Validators();
    }

    @Test(expected = InvalidLengthOfStayException.class)
    public void ShouldLengthOfStayBeLessThanOrEqualtoZeroInvalidLengthOfStayException() {
        Validators validators = new Validators();
        validators.isLengthOfStayValid("-1");
    }
    @Test(expected = InvalidDateRange.class)
    public void ShouldMinStartDateRangeIsGreaterThanMaxStartDateInvalidDateRange(){
        Validators validators = new Validators();
        int[] minStartDateArray= new int[]{2018,5,2};
        int[] maxStartDateArray= new int[]{2018,3,2};
        validators.isStartDateLessThanEndDate(minStartDateArray,maxStartDateArray);
    }
    @Test
    public void ShouldMinStarRatingIsGreaterThanMaxStarRatingInvalidStarRatingException(){
       Validators validators = new Validators();
       String minStar ="5";
       String maxStar="2";
       validators.isMinStarLessThanOrEqualMaxStar(minStar,maxStar);
    }
}
