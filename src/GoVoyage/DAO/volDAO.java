package GoVoyage.DAO;

import GoVoyage.ENTITIES.vol;
import GoVoyage.IDAO.IvolDAO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;
import GoVoyage.UTIL.MyConnection;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ashref
 */
public class volDAO implements IvolDAO {

    private Connection cnx;

    public volDAO() {
        cnx = MyConnection.getInstance();
    }

    @Override
    public boolean insertvol(vol vl) {
        String query = "INSERT INTO vol(nomCompagnie, villeDepart, villeArrivee,dateDepart,dateArrivee, nomAeroport) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement pSt = cnx.prepareStatement(query);
            pSt.setString(1, vl.getNomCompagnie());

            pSt.setString(2, vl.getVilleDepart());
            pSt.setString(3, vl.getVilleArrivee());
            pSt.setString(4, vl.getDateDepart());
            pSt.setString(5, vl.getDateArrivee());
            pSt.setString(6, vl.getNomAeroport());

            pSt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println("vol non ajouté!");
            return false;
        }

    }

    //modifier circuit
    @Override
    public boolean updatevol(vol vl) {
        String query = "UPDATE vol SET nomCompagnie=? ,villeDepart=? ,villeArrivee=? ,dateDepart=? ,dateArrivee=? ,nomAeroport=?  WHERE id=? ";

        try {
            PreparedStatement pSt = cnx.prepareStatement(query);
            pSt.setString(1, vl.getNomCompagnie());

            pSt.setString(2, vl.getVilleDepart());
            pSt.setString(3, vl.getVilleArrivee());
            pSt.setString(4, vl.getDateDepart());
            pSt.setString(5, vl.getDateArrivee());
            pSt.setString(6, vl.getNomAeroport());
            pSt.setInt(7, vl.getId());

            pSt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println("vol non modifié!");
            return false;
        }
    }

    @Override
    public void deletevol(int id) {
        String requete = "DELETE FROM vol WHERE id=? ";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("vol supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    @Override
    public ArrayList<vol> displayAllvol() {
        ArrayList<vol> listevol = new ArrayList<>();

        String requete = "select * from vol";
        try {
            Statement statement = cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                vol vl = new vol();
                vl.setId(resultat.getInt(1));
                vl.setNomCompagnie(resultat.getString(2));
                vl.setVilleDepart(resultat.getString(3));
                vl.setVilleArrivee(resultat.getString(4));
                vl.setDateDepart(resultat.getString(5));
                vl.setDateArrivee(resultat.getString(6));

                listevol.add(vl);

                for (vol elem : listevol) {
                    System.out.println(elem);
                }
            }
            return listevol;

        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement de la liste des sejour " + ex.getMessage());
            return null;
        }
    }

    @Override
    public vol findvolById(int id) {
        vol vl = new vol();
        String requete = "select * from circuit where id=?";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                vl.setNomCompagnie(resultat.getString(2));
                vl.setVilleDepart(resultat.getString(3));
                vl.setVilleArrivee(resultat.getString(4));
                vl.setDateDepart(resultat.getString(5));
                vl.setDateArrivee(resultat.getString(6));
                vl.setNomAeroport(resultat.getString(7));
            }
            return vl;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du vol " + ex.getMessage());
            return null;
        }
    }

    @Override
    public vol findvolByvilledep(String villeDepart) {
        vol vl = new vol();
        String requete = "select * from vol where villeDepart=?";
        try {
            PreparedStatement ps = cnx.prepareStatement(requete);
            ps.setString(1, villeDepart);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                vl.setNomCompagnie(resultat.getString(2));
                vl.setVilleDepart(resultat.getString(3));
                vl.setVilleArrivee(resultat.getString(4));
                vl.setDateDepart(resultat.getString(5));
                vl.setDateArrivee(resultat.getString(6));
                vl.setNomAeroport(resultat.getString(7));
            }
            return vl;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du vol " + ex.getMessage());
            return null;
        }
    }

}
