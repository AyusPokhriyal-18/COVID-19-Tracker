package com.example.covid_19tracker.model;

public class StateModel {
    public StateModel(String stateName, String stateCase) {
        this.stateName = stateName;
        this.stateCase = stateCase;
    }

    private String stateName;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCase() {
        return stateCase;
    }

    public void setStateCase(String stateCase) {
        this.stateCase = stateCase;
    }

    private String stateCase;

}
