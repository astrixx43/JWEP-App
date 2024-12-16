package com.javaerr.javaerror;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import org.controlsfx.control.spreadsheet.Grid;

import java.util.ArrayList;

public class AddUncertaintyBoxHandler implements EventHandler<ActionEvent>{
    GridPane root;
    int i;
    private JavaErrorModel model;
    public AddUncertaintyBoxHandler(GridPane root, int i, JavaErrorModel model){
        this.root = root;
        this.i = i;
        this.model = model;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        if (((CheckBox)actionEvent.getSource()).isSelected()){
            TextField tf = new TextField();
            tf.setPromptText("Enter Uncertainty Range");
            root.add(tf,2 , i+1);
            model.getVariables().get(i).add(tf);
        }
    }
}
