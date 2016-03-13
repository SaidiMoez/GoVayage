
package GoVoyage.IDAO;


import GoVoyage.ENTITIES.vol;
import java.util.ArrayList;

public interface IvolDAO {
    
    boolean insertvol(vol vl);
    
    boolean updatevol(vol vl);
    
    void deletevol(int id);
    
    ArrayList<vol> displayAllvol();
    
    vol findvolById(int id);
    
    vol findvolByvilledep(String villeDepart);
 
}
