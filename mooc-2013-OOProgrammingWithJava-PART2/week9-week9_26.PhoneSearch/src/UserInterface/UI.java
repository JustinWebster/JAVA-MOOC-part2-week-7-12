/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package UserInterface;


import People.PhoneBook;

import java.util.Scanner;

/**
 *
 * @author spike
 */
public class UI {

    private Scanner reader;
   
    public UI() {
        reader = new Scanner(System.in);
        
    }

    public void start() {
        PhoneBook phone = new PhoneBook();
        String command = "0";
        String name = "";
        String street = "";
        String city = "";
        String number = "";
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n"
                + ""
        );
        while (!command.equals("x")) {

            System.out.print("command: ");

            command = reader.nextLine();
            
            if (command.equalsIgnoreCase("1")) {
                System.out.print("whose number: ");
                 name = reader.nextLine().toLowerCase();
                phone.addContact(name);
                System.out.print("number: ");
                number = reader.nextLine();
                phone.addNumber(name, number);
                System.out.println("");
            }
            if(command.equals("2")){
                System.out.print("whose number: ");
                name = reader.nextLine().toLowerCase();
                System.out.println(" " + phone.findNumber(name));
                ;
                System.out.println("");
            }
            if(command.equals("3")){
                System.out.print("number: ");
                number = reader.nextLine();
                System.out.println(phone.findName(number)+"\n");
            }
            if(command.equals("4")){
                System.out.print("whose address: ");
                name = reader.nextLine();
                System.out.print("street: ");
                street = reader.nextLine();
                System.out.print("city: ");
                city = reader.nextLine();
                String address = street + " " + city;
                phone.addContactAddress(name, address);
                System.out.println();
            }
            if(command.equals("5")){
                System.out.print("whose information: ");
                name = reader.nextLine();
                phone.personalInfoSearch(name);
                System.out.println();
            }
            if(command.equals("6")){
                System.out.print("whose information: ");
                name = reader.nextLine();
                phone.removePerson(name);
            }
            if(command.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                name = reader.nextLine();
                phone.keywordSearch(name);
            }

        }
    }
}
