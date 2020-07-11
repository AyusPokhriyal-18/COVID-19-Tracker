package com.example.covid_19tracker.model;

public class StateModel {
    private String Statename;
    private String Statecase;

    public String getStatename() {
        return Statename;
    }

    public void setStatename(String statename) {
        Statename = statename;
    }

    public String getStatecase() {
        return Statecase;
    }

    public void setStatecase(String statecase) {
        Statecase = statecase;
    }

    public StateModel(String statename, String statecase) {
        Statename = statename;
        Statecase = statecase;


    }
}
