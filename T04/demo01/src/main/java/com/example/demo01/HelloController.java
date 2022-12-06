package com.example.demo01;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private TextField txtCode;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private DatePicker calendarDoB;

    @FXML
    private GridPane panelBotonesUsuario;

    @FXML
    private GridPane panelBotonesAddUsuario;

    @FXML
    private GridPane panelUsuario;

    @FXML
    private GridPane panelLibros;

    @FXML
    private GridPane panelBotonesLibro;

    @FXML
    public void onAddUsuarioMouseClicked(){
        disableAllControlOnPanelUsuario(false);
        panelBotonesUsuario.setVisible(false);
        panelBotonesAddUsuario.setVisible(true);
    }

    public void onCancelClickAddUsuario(){
        disableAllControlOnPanelUsuario(true);
        panelBotonesUsuario.setVisible(true);
        panelBotonesAddUsuario.setVisible(false);
    }

    public void onClickBookImage(){
        panelUsuario.setVisible(false);
        panelBotonesUsuario.setVisible(false);
        panelBotonesAddUsuario.setVisible(false);
        panelLibros.setVisible(true);
        panelBotonesLibro.setVisible(true);
        eraseTextOnChangeWindow();
    }

    public void onClickUserImage() {
        panelUsuario.setVisible(true);
        panelBotonesUsuario.setVisible(true);
        panelBotonesAddUsuario.setVisible(false);
        panelLibros.setVisible(false);
        panelBotonesLibro.setVisible(false);
        disableAllControlOnPanelUsuario(true);
    }


    public void disableAllControlOnPanelUsuario(boolean disability){
        txtCode.setDisable(disability);
        txtFirstName.setDisable(disability);
        txtLastName.setDisable(disability);
        calendarDoB.setDisable(disability);
    }

    public void onClickExitImage(){
        System.exit(0);
    }

    public void onClickSearchImage(){
        txtCode.setDisable(false);
        panelBotonesUsuario.setVisible(false);
        panelBotonesAddUsuario.setVisible(true);
    }

    public void onClickEditImage(){
        txtFirstName.setDisable(false);
        txtLastName.setDisable(false);
        calendarDoB.setDisable(false);
        panelBotonesUsuario.setVisible(false);
        panelBotonesAddUsuario.setVisible(true);
    }

    public void eraseTextOnChangeWindow(){
        txtCode.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
    }
}