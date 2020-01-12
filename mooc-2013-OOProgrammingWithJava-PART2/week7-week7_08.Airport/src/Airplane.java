import java.util.HashMap;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Airplane {
   private HashMap<String, Integer> planes;
   private String ID;
    
    public Airplane(){
        planes = new HashMap<String, Integer>(); 
        
    }
    
    public void addPlane(String id, int cap){
        this.ID = id;
        planes.put(id, cap);
    }

    
    public String printPlaneInfo(String id){
       
        return id +" (" + planes.get(id) + " ppl)";
    }
    
    public void printPlanes(){
        for(String pId : planes.keySet()){
            System.out.println(pId + " (" + planes.get(pId) + " ppl)");
        }
    }
    
    
    
}
