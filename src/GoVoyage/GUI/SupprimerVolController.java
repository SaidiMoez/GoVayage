/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoVoyage.GUI;

import GoVoyage.DAO.volDAO;
import GoVoyage.ENTITIES.vol;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ashref
 */
public class SupprimerVolController implements Initializable {

     @FXML
    private ListView showPane;
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            ashref();
    }
    
    public void ashref(){
         
        volDAO vlDAO = new volDAO();

        ObservableList<Pane> pane = FXCollections.observableArrayList();
        ArrayList<vol> listevol = vlDAO.displayAllvol();
     
        for (int i = 0; i < listevol.size(); i++) {
                pane.add(getPaysInPane(listevol.get(i)));
        }
                showPane.setItems(pane);
                showPane.setSelectionModel(null);
            
             
        
    }
    
    
        public Pane getPaysInPane(vol vl) {
       volDAO vlDAO = new volDAO();
        Pane pane = new Pane();

        Label NomCompagnie = new Label("NomCompagnie : " + vl.getNomCompagnie());
        NomCompagnie.setLayoutX(5);
        NomCompagnie.setLayoutY(5);

        Label VilleDepart = new Label("VilleDepart : " + vl.getVilleDepart());
        VilleDepart.setLayoutX(250);
        VilleDepart.setLayoutY(5);

        Label VilleArrivee = new Label("VilleArrivee : " + vl.getVilleArrivee());
        VilleArrivee.setLayoutX(400);
        VilleArrivee.setLayoutY(5);


        Button remove = new Button("Supprimer");
        remove.setLayoutX(610);
        remove.setLayoutY(5);
        remove.getStyleClass().add("btn-danger");

        remove.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println("ASHHHHH");
                vlDAO.deletevol(vl.getId());
                ashref();
            }
        });

        pane.getChildren().addAll(NomCompagnie, VilleDepart, VilleArrivee, remove);
        pane.setStyle("-fx-border-style: dotted; -fx-border-radius: 5px; -fx-padding: 5px; -fx-font-size: 16px;");

        return pane;
    }
    
}
