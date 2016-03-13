/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoVoyage.ENTITIES;

import java.util.Date;

/**
 *
 * @author ashref
 */
public class vol {
    private int id;
    private String nomCompagnie;
    private String villeDepart;
    private String villeArrivee;
    private String dateDepart;
    private String dateArrivee;
    private String nomAeroport;

    public vol() {
    }

    public vol(String nomCompagnie, String villeDepart, String villeArrivee, String dateDepart, String dateArrivee, String nomAeroport) {
        this.nomCompagnie = nomCompagnie;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.nomAeroport = nomAeroport;
    }

    public vol(int id, String nomCompagnie, String villeDepart, String villeArrivee, String dateDepart, String dateArrivee, String nomAeroport) {
        this.id = id;
        this.nomCompagnie = nomCompagnie;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.nomAeroport = nomAeroport;
    }

    public vol(int id, String nomCompagnie, String villeDepart, String villeArrivee, String nomAeroport) {
        this.id = id;
        this.nomCompagnie = nomCompagnie;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.nomAeroport = nomAeroport;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final vol other = (vol) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vol{" + "id=" + id + ", nomCompagnie=" + nomCompagnie + ", villeDepart=" + villeDepart + ", villeArrivee=" + villeArrivee + ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", nomAeroport=" + nomAeroport + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }

    public void setNomCompagnie(String nomCompagnie) {
        this.nomCompagnie = nomCompagnie;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getNomAeroport() {
        return nomAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }
    

}
