/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controllers;

import br.com.fatec.DAO.ProprietarioDAO;
import br.com.fatec.model.Proprietario;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ViewComboController implements Initializable {

    @FXML
    private TextField txtCodigo;
    @FXML
    private ComboBox<Proprietario> cbProprietario;
    
    private ObservableList<Proprietario> proprietarios = 
        FXCollections.observableArrayList();  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbProprietario.setItems(proprietarios);
        preencheCombo();
        
        //programa a troca de valores da combo para mostrar
        //o codigo no textField
        cbProprietario.valueProperty().addListener((value, velho, novo) -> {
            txtCodigo.setText(Integer.toString(novo.getCodProprietario()));
        });
        

    }    

    private void preencheCombo() {
        ProprietarioDAO dao = new ProprietarioDAO();
        
        ArrayList<Proprietario> lista;
        try {
            lista = (ArrayList<Proprietario>) dao.lista(""); //traz todo mundo
            proprietarios.addAll(lista);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
