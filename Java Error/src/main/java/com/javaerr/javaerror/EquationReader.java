package com.javaerr.javaerror;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class EquationReader implements EventHandler<ActionEvent> {
    private TextField equation;
    private JavaErrorModel model;
    public EquationReader(TextField tf, JavaErrorModel model) {
        this.equation = tf;
        this.model = model;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        String equation = this.equation.getText();
        System.out.println(equation);
        for(ArrayList<TextField> variableList: model.getVariables()){
            if(equation.contains(variableList.get(0).getText())) {
                System.out.println(variableList.get(0).getText());
                System.out.println(variableList.get(1).getText());
                if (variableList.size() > 2) {
                    System.out.println(variableList.get(2).getText());
                }

            }
        }

    }
}
