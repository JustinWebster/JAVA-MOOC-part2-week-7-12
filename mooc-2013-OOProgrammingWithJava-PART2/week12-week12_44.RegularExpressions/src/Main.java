
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);
        while(true){
        System.out.print("Give a string: ");
        String given = reader.nextLine();
        
        
        if(clockTime(given)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
         }
        }
    }
    
    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public static boolean allVowels(String string){
        return string.matches("[aeiouäö]*");
    }
    
    public static boolean clockTime(String string){
        try{//try catch needed to catch IndexOutOfBoundsException or NumberFormatException with invalid inputs
        String hours = string.substring(0, 2);
        int toParse = Integer.parseInt(hours);
        if(toParse < 24){
        return string.matches("[0-2][0-9]:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}");
        }else{
            return false;
        }
        }catch(Exception e){
            return false;
        }
    }
}
