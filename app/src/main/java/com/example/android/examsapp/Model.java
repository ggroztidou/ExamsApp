package com.example.android.examsapp;

/**
 * Created by user on 26/6/2017.
 */

public class Model {

    private String id;
    private String legalName;

    public  Model(String id, String legalName)
    {
        this.id=id;
        this.legalName=legalName;

    }

    public String getId() {
        return id;
    }

    public String getLegalName() {
        return legalName;
    }

    }
