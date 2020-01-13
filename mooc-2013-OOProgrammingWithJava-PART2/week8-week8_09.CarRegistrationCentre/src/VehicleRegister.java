/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {

        this.owners = new HashMap<RegistrationPlate, String>();

    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        } else {
            return false;
        }

    }

    public String get(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return null;
        } else {
            return this.owners.get(plate);
        }
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return false;
        } else {
            this.owners.remove(plate);
            return true;
        }

    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.owners.keySet()){
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> carOwners = new ArrayList<String>();
        for(RegistrationPlate plate : this.owners.keySet()){
            
            String carOwner = this.owners.get(plate);
            
            if(!carOwners.contains(carOwner)){
                carOwners.add(carOwner);
            }
            
        }
        
        for(String name : carOwners){
            
            System.out.println(name);
        
        }
    }
}
