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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ashref
 */
public class RechercheVolController implements Initializable {

     @FXML
    private TextField rech;
    
    @FXML
    private Button add;
    
    @FXML
    ListView showPane;
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void action(){
       String h;
       h=rech.getText();
       ashref(h) ;
        
    }
    
        public void ashref(String h){
         
        volDAO vlDAO = new volDAO();

        ObservableList<Pane> pane = FXCollections.observableArrayList();
        vol listevol = vlDAO.findvolByvilledep(h);
     
       
                pane.add(getPaysInPane(listevol));
        
                showPane.setItems(pane);
                showPane.setSelectionModel(null);
           
    }
        
        
           public Pane getPaysInPane(vol vl) {
        volDAO vlDAO = new volDAO();
        Pane pane = new Pane();

        Label NomCompagnie = new Label("NomCompagnie : " + vl.getNomCompagnie());
        NomCompagnie.setLayoutX(5);
        NomCompagnie.setLayoutY(5);

        Label villedp = new Label("villedepart : " + vl.getVilleDepart());
        villedp.setLayoutX(300);
        villedp.setLayoutY(5);

        Label VilleArrivee = new Label("VilleArrivee : " + vl.getVilleArrivee());
        VilleArrivee.setLayoutX(600);
        VilleArrivee.setLayoutY(5);
        
        Label DateDepart = new Label("DateDepart : " + vl.getDateDepart());
        DateDepart.setLayoutX(900);
        DateDepart.setLayoutY(5);
        
        Label DateArrivee = new Label("DateArrivee : " + vl.getDateArrivee());
        DateArrivee.setLayoutX(1200);
        DateArrivee.setLayoutY(5);


        /*Button remove = new Button("Supprimer");
        remove.setLayoutX(1500);
        remove.setLayoutY(5);
        remove.getStyleClass().add("btn-danger");
        */
       /* Button modif = new Button("MOdifier");
        modif.setLayoutX(1800);
        modif.setLayoutY(5);
        modif.getStyleClass().add("btn-danger");
               */

        
        pane.getChildren().addAll(NomCompagnie, villedp,VilleArrivee,DateDepart ,DateArrivee);
        pane.setStyle("-fx-border-style: dotted; -fx-border-radius: 5px; -fx-padding: 5px; -fx-font-size: 16px;");

        return pane;
    }
        
    
}