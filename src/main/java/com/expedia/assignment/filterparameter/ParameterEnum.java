package com.expedia.assignment.filterparameter;

public enum ParameterEnum {
DESTINATIONCITY("destinationCity"),DESTINATIONNAME("destinationName"),REGIONID("regionID"),MINTRIPSTARTDATE ("minStartDate"),MAXTRIPSTARTDATE("maxStartDate")
    ,LENGTHOFSTAY("lengthOfStay"),MINSTARRATING("minStarRating"),MAXSTARRATING("maxStarRating"),MINTOTALRATING("minTotalRate"),
    MAXTOTALRATING("maxTotalRate"),MINGUESTRATING("minGuestRating"),MAXGUESTRATING("maxGuestRating"),DESTINATION("destination");
    private String parameter;
    ParameterEnum(String parameter) {
        this.parameter = parameter;
    }

    public String parameter() {
        return parameter;
    }
}
