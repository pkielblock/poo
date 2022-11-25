package br.com.fatec;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private MenuItem mnuItemTela_Teste;
    @FXML
    private Menu mnuSair;

    @FXML
    private void mnuItemTelaTeste_Click(ActionEvent event) throws IOException {
        Cadastro cad = new Cadastro();
        cad.start(new Stage());
    }

    @FXML
    private void mnuItemSair_Click(ActionEvent event) {
        App.fechar();
        System.exit(0);
    }
}