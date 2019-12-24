/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class Calculator {

    private Reader reader = new Reader();;
    private Counter calculationCounter = new Counter(); 
    
    
    private void calculation(){
       
        calculationCounter.increase();
    }
    
    private void sum() {
        int s =1;
        
        calculation();

        System.out.print("Value1: ");
        int a = reader.readInteger();

        
        System.out.print("Value2: ");
        a += reader.readInteger();

        System.out.println("Sum of the values " + a);

    }

    private void difference() {

        calculation();

        System.out.print("Value1: ");
        int a = reader.readInteger();

        
        System.out.print("Value2: ");
        a -= reader.readInteger();

        System.out.println("Difference of the values " + a);

    }

    private void product() {

        calculation();

        System.out.print("Value1: ");
        int a = reader.readInteger();

        
        System.out.print("Value2: ");
        a *= reader.readInteger();

        System.out.println("Product of the values " + a);

    }

    private void statistics() {
        
        System.out.println("Calculations done: " + calculationCounter.counter);

    }

    public void start() {

        while (true) {

            System.out.print("command: ");
            String command = reader.readString();

            if (command.equals("end")) {

                break;
            }
            if (command.equals("sum")) {

                sum();
            } else if (command.equals("difference")) {

                difference();
            } else if (command.equals("product")) {

                product();
            }
        }

        statistics();
    }
}
