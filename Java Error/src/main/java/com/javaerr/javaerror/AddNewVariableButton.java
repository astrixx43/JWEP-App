package com.javaerr.javaerror;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.Axis;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class AddNewVariableButton implements EventHandler<ActionEvent> {
    private GridPane root;
    private ArrayList<TextField> varField = new ArrayList<TextField>();
    private ArrayList<TextField> dataField = new ArrayList<TextField>();
    private ArrayList<CheckBox> checkBoxes = new ArrayList<CheckBox>();
    private JavaErrorModel model;

    int i = 0;

    public AddNewVariableButton(GridPane root, JavaErrorModel model) {
        this.root = root;
        this.model = model;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        TextField newVar = new TextField();
        TextField newData = new TextField();
        newVar.setPromptText("Variable Name");
        newData.setPromptText("Data Range");
        varField.add(newVar);
        dataField.add(newData);
        checkBoxes.add(new CheckBox("Check Box If you have pre calculated uncertainties"));
        root.addRow(i+1,varField.get(i));
        root.addRow(i+1,dataField.get(i));
        root.add(checkBoxes.get(i), 3,i+1);
        checkBoxes.get(i).setOnAction(new AddUncertaintyBoxHandler(root, i,
                model));

        ArrayList<TextField> variableList = new ArrayList<>();
        variableList.add(newVar);
        variableList.add(newData);
        model.getVariables().add(variableList);

        i = i + 1;
    }
}
