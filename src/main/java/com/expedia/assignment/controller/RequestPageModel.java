package com.expedia.assignment.controller;

import org.springframework.context.annotation.Bean;

import java.util.Date;


public class RequestPageModel {
    private String destination;

    public String getDestinationFilterType() {
        return destinationFilterType;
    }

    public void setDestinationFilterType(String destinationFilterType) {
        this.destinationFilterType = destinationFilterType;
    }

    private String destinationFilterType;
    private Date minStartDate;
    private Date maxStartDate;
    private String minStarRating;
    private String maxStarRating;
    private String minTotalRating;
    private String maxTotalRating;
    private String minGuestRating;
    private String lengthOfStay;

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public  RequestPageModel(){


    }

    public RequestPageModel(String destination, int destinationParam, Date minStartDate, Date maxStartDate, String minStarRating, String maxStarRating, String minTotalRating, String maxTotalRating, String minGuestRating, String maxGuestRating,String lengthOfStay) {
        this.destination = destination;
        this.minStartDate = minStartDate;
        this.maxStartDate = maxStartDate;
        this.minStarRating = minStarRating;
        this.maxStarRating = maxStarRating;
        this.minTotalRating = minTotalRating;
        this.maxTotalRating = maxTotalRating;
        this.minGuestRating = minGuestRating;
        this.maxGuestRating = maxGuestRating;
        this.lengthOfStay=lengthOfStay;
    }

    private String maxGuestRating;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getMinStartDate() {
        return minStartDate;
    }

    public void setMinStartDate(Date minStartDate) {
        this.minStartDate = minStartDate;
    }

    public Date getMaxStartDate() {
        return maxStartDate;
    }

    public void setMaxStartDate(Date maxStartDate) {
        this.maxStartDate = maxStartDate;
    }

    public String getMinStarRating() {
        return minStarRating;
    }

    public void setMinStarRating(String minStarRating) {
        this.minStarRating = minStarRating;
    }

    public String getMaxStarRating() {
        return maxStarRating;
    }

    public void setMaxStarRating(String maxStarRating) {
        this.maxStarRating = maxStarRating;
    }

    public String getMinTotalRating() {
        return minTotalRating;
    }

    public void setMinTotalRating(String minTotalRating) {
        this.minTotalRating = minTotalRating;
    }

    public String getMaxTotalRating() {
        return maxTotalRating;
    }

    public void setMaxTotalRating(String maxTotalRating) {
        this.maxTotalRating = maxTotalRating;
    }

    public String getMinGuestRating() {
        return minGuestRating;
    }

    public void setMinGuestRating(String minGuestRating) {
        this.minGuestRating = minGuestRating;
    }

    public String getMaxGuestRating() {
        return maxGuestRating;
    }

    public void setMaxGuestRating(String maxGuestRating) {
        this.maxGuestRating = maxGuestRating;
    }

}
