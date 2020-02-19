/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
package People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> phoneBook;
    private Map<String, String> adressBook;
    private List<String> personalInfo;

    public PhoneBook() {
        this.phoneBook = new HashMap();
        this.adressBook = new HashMap();
        this.personalInfo = new ArrayList();
    }

//returns all personal info of person whos name or address contains the keyword 
    public void keywordSearch(String keyword) {
        

        if (keyword.equals("")) {
            for (String key : this.phoneBook.keySet()) {
                personalInfoSearch(key);
            }
        }

        for (String key : this.phoneBook.keySet()) {
            if (!key.contains(keyword)) {
                
            }
            if (key.contains(keyword)) {
                this.personalInfo.add(key);
                
            }
            for (String key2 : this.adressBook.keySet()) {
                if (!key2.contains(keyword)) {
                    
                }
                if (key2.contains(keyword) || this.adressBook.get(key2).contains(keyword)) {
                    this.personalInfo.add(key2);
                    
                }
            }
        }
        if (this.personalInfo.isEmpty()) {
            System.out.println(" keyword not found");
        }
        Collections.sort(this.personalInfo);
        for (String name : this.personalInfo) {
            System.out.println(" " + name);
            personalInfoSearch(name);
        }

    }

    //maps person to list for number storage
    public void addContact(String name) {
        if (!this.phoneBook.containsKey(name)) {
            this.phoneBook.put(name, new ArrayList<String>());
        }
    }

    //maps an address to someones name
    public void addContactAddress(String name, String address) {

        if (!this.adressBook.containsKey(name)) {
            this.adressBook.put(name, address);
        }
    }

    //searches by name for someones address
    public String getAddress(String name) {

        for (String key : this.adressBook.keySet()) {
            if (key.equals(name)) {
                return "  address: " + this.adressBook.get(key);
            }
        }
        return "  address unknown";
    }

    //Searches by name for all info attached to a person
    public void personalInfoSearch(String name) {

        if (this.phoneBook.containsKey(name) || this.adressBook.containsKey(name)) {
            System.out.println(getAddress(name));

            System.out.println(findNumber(name));
        } else {
            System.out.println("  not found");
        }
    }

    //Removes a person from the phone and address book
    public void removePerson(String name) {

        if (this.phoneBook.containsKey(name)) {
            this.phoneBook.remove(name);
        }
        if (this.adressBook.containsKey(name)) {
            this.adressBook.remove(name);
        }
    }

    // adds number to a persons list of numbers
    public void addNumber(String name, String number) {

        this.phoneBook.get(name).add(number);
    }

    //finds a persons number via their name
    public List findNumber(String name) {

        if (!this.phoneBook.containsKey(name)) {
            System.out.println("  phone number not found");
        }
        System.out.println("  phone numbers:");
        return this.phoneBook.get(name);

    }

    //finds a persons name via either of their numbers
    public String findName(String number) {

        for (String key : this.phoneBook.keySet()) {
            if (this.phoneBook.get(key).contains(number)) {
                return key;
            }
        }
        return " not found";
    }
}
