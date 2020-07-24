package com.example.covid_19tracker.model;

public class CountryModel {
    public CountryModel(String countryName, String countryCase) {
        CountryName = countryName;
        CountryCase = countryCase;
    }

    private String CountryName;

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public static String getCountryCase() {
        return CountryCase;
    }

    public void setCountryCase(String countryCase) {
        CountryCase = countryCase;
    }

    private static String CountryCase;


}
