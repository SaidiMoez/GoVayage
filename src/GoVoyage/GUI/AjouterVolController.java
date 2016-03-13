/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoVoyage.GUI;

import GoVoyage.DAO.volDAO;
import GoVoyage.ENTITIES.vol;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ashref
 */
public class AjouterVolController implements Initializable {

    @FXML
    private TextField nomCompagnie;

    @FXML
    private TextField villeDepart;

    @FXML
    private TextField villeArrivee;

    @FXML
    private TextField dateDepart;

    @FXML
    private TextField dateArrivee;

    @FXML
    private TextField nomAeroport;

    @FXML
    private Button add;

    @FXML
    public void AjouterVol(ActionEvent event) {

        vol h = new vol();
        volDAO hd = new volDAO();

        h.setNomCompagnie(nomCompagnie.getText());
        h.setVilleDepart(villeDepart.getText());
        h.setVilleArrivee(villeArrivee.getText());
        h.setDateDepart(dateDepart.getText());
        h.setDateArrivee(dateArrivee.getText());

        h.setNomAeroport(nomAeroport.getText());

        hd.insertvol(h);

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
