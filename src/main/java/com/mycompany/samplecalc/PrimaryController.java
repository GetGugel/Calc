package com.mycompany.samplecalc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tf_Output;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btnMlt;
    @FXML
    private Button btnSub;
    @FXML
    private Button btnEqual;
    @FXML
    private Button btnAdd;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void process(ActionEvent event) {
    }

    @FXML
    private void processEqual(ActionEvent event) {
    }

    @FXML
    private void processDigt(ActionEvent event) {
    }
}
