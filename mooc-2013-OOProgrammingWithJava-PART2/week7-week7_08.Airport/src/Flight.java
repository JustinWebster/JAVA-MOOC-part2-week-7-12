
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */


public class Flight {
   
    private HashMap<String, String> flightList;
   
    
    
    public Flight(){
        
        flightList = new HashMap<String, String>();
        
    }
    
    public void addFlight(String from, String destination, String flightID){
        String fullRoute = " (" + from + "-" + destination + ")";
        
        
        while(flightList.containsKey(flightID)){
        
            flightID = flightID+" ";
        
        }
        flightList.put(flightID, fullRoute);
        
        
    }
    

    public void printFlights(Airplane plane){
        
        for(String fId : flightList.keySet()){
            System.out.println(plane.printPlaneInfo(fId.trim())  + flightList.get(fId));
            
        }
    }
    
}
