package com.example.myapplication;

public class Organisation {

    String organisationID;
    String organisationName;
    String organisationAddress;

    public Organisation(String organisationID, String organisationName, String organisationGenre){
        this.organisationID=organisationID;
        this.organisationName=organisationName;
        this.organisationAddress=organisationAddress;
    }

    public String getOrganisationID(){
        return organisationID;

    }

    public String getOrganisationName(){
        return organisationName;

    }

    public String getOrganisationAddress(){
        return organisationAddress;

    }

}
