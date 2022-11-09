/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controllers;

import br.com.fatec.Produto;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ProductsComboController implements Initializable {

    @FXML
    private GridPane gdDados;
    @FXML
    private Label lblCodigo;
    @FXML
    private Label lblDescricao;
    @FXML
    private Label lblValor;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtDescricao;
    @FXML
    private TextField txtValor;
    @FXML
    private ComboBox<Produto> cbProdutos;
    @FXML
    private HBox hbBotoes;
    @FXML
    private Button btnInserir;
    @FXML
    private Button btnMostrar;
    @FXML
    private CheckBox chkDuplicados;
     
    //cria collection para usar na combo box
    private ObservableList<Produto> produtos = 
            FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //vinculo coleção-combo
        cbProdutos.setItems(produtos);
        
        //adiciona um ouvinte para a combobox
        changeValueCombo();
    }

    @FXML
    private void btnInserir_Click(ActionEvent event) {
        //verificar existencia de dados duplicados
        if(!chkDuplicados.isSelected()) {
            Produto p = new Produto();
            p.setCodigo(Integer.parseInt(txtCodigo.getText()));
           
            //verifica se o produto p esta na collection da combobox
            if(produtos.contains(p)) {
                Alert alerta = new Alert(Alert.AlertType.ERROR,
                    "Produto já cadastrado!!!",
                    ButtonType.OK);
                alerta.showAndWait();
                
                return;
            }
        }
        //colocar dados
        produtos.add(moveTelaParaObjeto());

        limparCampos();
        txtCodigo.requestFocus();
    }
    
    private void limparCampos() {
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtValor.setText("");
    }
    
    private Produto moveTelaParaObjeto() {
       //instanciando
        Produto p = new Produto();
        p.setCodigo(Integer.parseInt(txtCodigo.getText()));
        p.setDescricao(txtDescricao.getText());
        p.setValor(Float.parseFloat(txtValor.getText()));
        
        return p;
    }
    
    @FXML
    private void btnMostrar_Click(ActionEvent event) {
        //pega objeto na combo
        Produto p = cbProdutos.getValue();
        
        //verificação
        if(p == null){
            Alert alerta = new Alert(Alert.AlertType.ERROR,
                "Selecione algum item na Combobox!!!",
                ButtonType.OK);
            alerta.showAndWait();
        }
        else{
            moveObjetoParaTela(p);
        }
            
    }
    
    private void moveObjetoParaTela(Produto p){
        txtCodigo.setText(Integer.toString(p.getCodigo()));
        txtDescricao.setText(p.getDescricao());
        txtValor.setText(Float.toString(p.getValor()));
    }
    
    private void changeValueCombo(){
        cbProdutos.valueProperty().addListener((value, velho, novo) -> {
            txtCodigo.setText(Integer.toString(novo.getCodigo()));
            txtDescricao.setText(novo.getDescricao());
            txtValor.setText(Float.toString(novo.getValor()));
        });
    }
}
