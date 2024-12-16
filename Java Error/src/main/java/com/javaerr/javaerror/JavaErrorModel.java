package com.javaerr.javaerror;

import javafx.scene.control.TextField;

import java.util.ArrayList;

public class JavaErrorModel {
    private ArrayList<ArrayList<TextField>> variables;

    public JavaErrorModel() {
        variables = new ArrayList<ArrayList<TextField>>();
    }

    public ArrayList<ArrayList<TextField>> getVariables() {
        return variables;
    }

}
