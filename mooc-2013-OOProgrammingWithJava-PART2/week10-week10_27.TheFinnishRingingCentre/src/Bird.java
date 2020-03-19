
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;
    List<String> places;
    
    
    public Bird(String name, String latinName, int ringingYear) {
        this.places = new ArrayList();
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 97 * hash + this.ringingYear;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bird other = (Bird) obj;
        if (this.ringingYear != other.ringingYear) {
            return false;
        }
        if( this.latinName.equals(other.latinName) && this.ringingYear == other.ringingYear){
            return true;
        }
        if ((this.latinName == null) ? (other.latinName != null) : !this.latinName.equals(other.latinName)) {
            return false;
        }
        return true;
    }

    

    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


