/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoVoyage.TEST;

import GoVoyage.DAO.volDAO;
import GoVoyage.ENTITIES.vol;
import GoVoyage.IDAO.IvolDAO;

/**
 *
 * @author dell
 */
public class haha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vol vl= new vol(2,"tunisaire", "tunis", "paris","18 mars 2016 10:52","18 mars 2016 02:52", "orlyAirport");
        vol vl2= new vol(4,"sifax", "sfax", "rome","18 mars 2016 10:52","18 mars 2016 02:52", "romeAirport");
        IvolDAO ivl= new volDAO();
       // ivl.insertvol(vl2);
        //ivl.updatevol(vl);
        //ivl.deletevol(6);
       // ivl.displayAllvol();
       //  System.out.println(ivl.findvolByvilledep("sfax"));
         // System.out.println(ivl.findvolById(3));

    }
    
}
