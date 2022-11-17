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
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ViewProprietarioController implements Initializable {

    @FXML
    private Label lblCodigo;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNome;
    @FXML
    private Label lblNome;
    @FXML
    private Button btnIncluir;
    @FXML
    private Button btnAlterar;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnSair;
    @FXML
    private Button btnPesquisar;
    //variaveis auxiliares
    private Proprietario proprietario;
    private ProprietarioDAO dao = new ProprietarioDAO();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        habilitaInclusao(); //faz a tela ser de inclusão
        
        //programa o evento de ganhar o foco no 
        //txtCodigo
        txtCodigo.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, 
                    Boolean oldValue, Boolean newValue) {
                if(newValue) { //ganhou o FOCO
                    limparCampos();
                    habilitaInclusao();
                }
             }
        });
    }    

    @FXML
    private void btnIncluir_Click(ActionEvent event) {
        //joga os dados da tela para o objeto
        proprietario = new Proprietario();
        proprietario.setCodProprietario(Integer.parseInt(txtCodigo.getText()));
        proprietario.setNome(txtNome.getText());
        
        try {
            if(dao.insere(proprietario)) {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Dados Incluídos com sucesso !!!");
                alerta.showAndWait(); //exibe a mensagem
                //limpa os campos
                txtCodigo.setText("");
                txtNome.setText("");
                
                txtCodigo.requestFocus();
            }
            else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Ocorreu algum problema");
                alerta.showAndWait(); //exibe a mensagem
            }
        } catch (SQLException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Mensagem");
            alerta.setHeaderText("Atenção");
            alerta.setContentText(ex.getMessage());
            alerta.showAndWait(); //exibe a mensagem
        }
        
    }

    @FXML
    private void btnAlterar_Click(ActionEvent event) {
        //joga os dados da tela para o objeto
        proprietario = new Proprietario();
        proprietario.setCodProprietario(Integer.parseInt(txtCodigo.getText()));
        proprietario.setNome(txtNome.getText());
        
        try {
            if(dao.altera(proprietario)) {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Dados Alterados com sucesso !!!");
                alerta.showAndWait(); //exibe a mensagem
                
                limparCampos();
                txtCodigo.requestFocus();
                habilitaInclusao();
            }
            else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Ocorreu algum problema");
                alerta.showAndWait(); //exibe a mensagem
            }
        } catch (SQLException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Mensagem");
            alerta.setHeaderText("Atenção");
            alerta.setContentText(ex.getMessage());
            alerta.showAndWait(); //exibe a mensagem
        }
    }

    @FXML
    private void btnExcluir_Click(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Mensagem");
        alerta.setHeaderText("Atenção");
        alerta.setContentText("Deseja remover esse proprietário mesmo?");

        Optional<ButtonType> resultado = alerta.showAndWait();
        
        if (resultado.get() == ButtonType.CANCEL){
            return; //sai do método
        }

        //joga os dados da tela para o objeto
        proprietario = new Proprietario();
        proprietario.setCodProprietario(Integer.parseInt(txtCodigo.getText()));
        proprietario.setNome(txtNome.getText());
        
        try {
            if(dao.remove(proprietario)) {
                alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Proprietário removido com sucesso !!!");
                alerta.showAndWait(); //exibe a mensagem
                
                limparCampos();                
                txtCodigo.requestFocus();
                habilitaInclusao();
            }
            else {
                alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Ocorreu algum problema");
                alerta.showAndWait(); //exibe a mensagem
            }
        } catch (SQLException ex) {
            alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Mensagem");
            alerta.setHeaderText("Atenção");
            alerta.setContentText(ex.getMessage());
            alerta.showAndWait(); //exibe a mensagem
        }

    }

    @FXML
    private void btnSair_Click(ActionEvent event) {

    }

    @FXML
    private void btnPesquisar_Click(ActionEvent event) {
        proprietario = new Proprietario();
        proprietario.setCodProprietario(Integer.parseInt(txtCodigo.getText()));
        try {
            proprietario = dao.buscaID(proprietario);
            
            //verifica se achou
            if(proprietario != null) { //achou
                //move os dados para a tela
                txtNome.setText(proprietario.getNome());
                //faz a tela alterar ou excluir
                habilitaAlteracaoExclusao();
            }
            else {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Mensagem");
                alerta.setHeaderText("Atenção");
                alerta.setContentText("Proprietário não encontrado!!!");
                alerta.showAndWait(); //exibe a mensagem
                
                txtCodigo.requestFocus();
            }
        } catch (SQLException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Mensagem");
            alerta.setHeaderText("Erro");
            alerta.setContentText(ex.getMessage());

            alerta.showAndWait(); //exibe a mensagem
            
            //manda o foco para o código
            txtCodigo.requestFocus();
        }
       
    }
 
    private void habilitaInclusao() {
        btnIncluir.setDisable(false);
        btnExcluir.setDisable(true);
        btnAlterar.setDisable(true);
    }
    
    private void habilitaAlteracaoExclusao(){
        btnIncluir.setDisable(true);
        btnExcluir.setDisable(false);
        btnAlterar.setDisable(false); 
    }
    
    private void limparCampos() {
        txtCodigo.setText("");
        txtNome.setText("");
               
    }
}
