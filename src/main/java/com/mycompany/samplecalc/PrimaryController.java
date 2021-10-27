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
String opd1="",arth0p="";
    @FXML
    private void process(ActionEvent event) {
       
       switch (((Button)event.getSource()).getText()){
            case"+":{
                opd1 = tf_Output.getText().toString().trim();
                arth0p="ADD";
                tf_Output.setText("");

                
            }break;
            case"*":tf_Output.setText(tf_Output.getText() + "2"); break;
            
            
       }
    }

    @FXML
    private void processEqual(ActionEvent event) {
        if(arth0p.equals("ADD")){
        tf_Output.setText(
        (Integer.parseInt(opd1)+Integer.parseInt( tf_Output.getText().trim()))
        );
    }
    
    }

    @FXML
    private void processDigt(ActionEvent event) {
/*
    if (((Button)event.getSource()).getText().equals("9")){
        tf_Output.setText(tf_Output.getText() + "9");
        System.out.println(((Button)event.getSource()).getText());
    }
    if (((Button)event.getSource()).getText().equals("8")){
        tf_Output.setText(tf_Output.getText() + "8");
        System.out.println(((Button)event.getSource()).getText());
    }
    if (((Button)event.getSource()).getText().equals("7")){
        tf_Output.setText(tf_Output.getText() + "7");
        System.out.println(((Button)event.getSource()).getText());
    }*/
    if(tf_Output.getText().endsWith("0")) tf_Output.setText("");{
        
    }


    switch (((Button)event.getSource()).getText()){
            case"1":tf_Output.setText(tf_Output.getText() + "1"); break;
            case"2":tf_Output.setText(tf_Output.getText() + "2"); break;
            case"3":tf_Output.setText(tf_Output.getText() + "3"); break;
            case"4":tf_Output.setText(tf_Output.getText() + "4"); break;
            case"5":tf_Output.setText(tf_Output.getText() + "5"); break; 
            case"6":tf_Output.setText(tf_Output.getText() + "6"); break;
            case"7":tf_Output.setText(tf_Output.getText() + "7"); break;
            case"8":tf_Output.setText(tf_Output.getText() + "8"); break;
            case"9":tf_Output.setText(tf_Output.getText() + "9"); break;
            case"0":tf_Output.setText(tf_Output.getText() + "0"); break;
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
