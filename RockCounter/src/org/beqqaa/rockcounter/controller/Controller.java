package org.beqqaa.rockcounter.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;


public class Controller {

    @FXML
    private TextField width_tf;
    @FXML
    private TextField height_tf;
    @FXML
    private TextField length_tf;
    @FXML
    private TextField area_tf;
    @FXML
    private TextField hiBuild_ft;

    @FXML
    private Label ansLabel;

    @FXML
    private void buttonRollUp(){

    }

    public void initialize() {
        removeLettersFromValue(width_tf);
        removeLettersFromValue(height_tf);
        removeLettersFromValue(length_tf);
        removeLettersFromValue(area_tf);
        removeLettersFromValue(hiBuild_ft);
    }

    @FXML
    private void buttonClose(){
        System.exit(0);
    }

    @FXML
    private void menuClose(){
        System.exit(0);
    }

    @FXML
    private void submit(){
        if (!width_tf.getText().equals("")
            &&
            !height_tf.getText().equals("")
            &&
            !length_tf.getText().equals("")
            &&
            !area_tf.getText().equals("")
            &&
            !hiBuild_ft.getText().equals("")){

            Double heightDouble = Double.parseDouble(height_tf.getText());
            Double lengthDouble = Double.parseDouble(length_tf.getText());
            Double areaDouble = Double.parseDouble(area_tf.getText());
            Double hiDouble = Double.parseDouble(hiBuild_ft.getText());

            Double result = (heightDouble * hiDouble) * ((Math.pow(areaDouble,2)) / lengthDouble);

            ansLabel.setText(String.valueOf(result));


        }else {

        }
    }

    @FXML
    private void reset(){
        width_tf.clear();
        height_tf.clear();
        length_tf.clear();
        area_tf.clear();
        hiBuild_ft.clear();
    }

    private void removeLettersFromValue(TextField field) {
        field.setTextFormatter(new TextFormatter<Object>(change -> {
            if (!change.getText().matches("[0-9\\.]")) {
                change.setText("");
            }
            return change;
        }));
    }

    public TextField getWidth_tf() {
        return width_tf;
    }
    public void setWidth_tf(TextField width_tf) {
        this.width_tf = width_tf;
    }

    public TextField getHeight_tf() {
        return height_tf;
    }

    public void setHeight_tf(TextField height_tf) {
        this.height_tf = height_tf;
    }

    public TextField getLength_tf() {
        return length_tf;
    }

    public void setLength_tf(TextField length_tf) {
        this.length_tf = length_tf;
    }

    public TextField getArea_tf() {
        return area_tf;
    }

    public void setArea_tf(TextField area_tf) {
        this.area_tf = area_tf;
    }

    public TextField getHiBuild_ft() {
        return hiBuild_ft;
    }

    public void setHiBuild_ft(TextField hiBuild_ft) {
        this.hiBuild_ft = hiBuild_ft;
    }

    public Label getAnsLabel() {
        return ansLabel;
    }

    public void setAnsLabel(Label ansLabel) {
        this.ansLabel = ansLabel;
    }
}
