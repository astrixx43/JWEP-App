package com.javaerr.javaerror;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;import javafx.scene.control.TextField;

public class ErrorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);

        Button btn = new Button("Add New Variable");
        TextField equationField = new TextField();
        equationField.setPromptText("Enter Equation");
        Button btn2 = new Button("Solve");
        JavaErrorModel errorModel = new JavaErrorModel();
        EquationReader eq = new EquationReader(equationField, errorModel);
        btn2.setOnAction(eq);
        TextField textField[] = new TextField[15];
        root.add(btn, 0,0);
        root.add(btn2, 1,0);
        root.add(equationField, 2,0);
        btn.setOnAction(new AddNewVariableButton(root, errorModel));

        Scene scene = new Scene(root,500 ,400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}