package Java.Exercises;

import java.util.HashMap;
import java.util.Set;

public class ContactList {
    public static void main(String[] args) {

    //Create a HashMap with Key telephone number and Value name of contanct.
    HashMap<Integer, String> contacts = new HashMap<>();

    //Add 5 Contacts
    contacts.put(123456789, "contact1");
    contacts.put(12345, "contact2");
    contacts.put(1234567, "contact3");
    contacts.put(123, "contact4");
    contacts.put(1234567, "contact5");

    
    // System.out.println(contacts);

    //Gives all the keys to the HashMap
    Set<Integer> keySet = contacts.keySet();

    for(Integer key : keySet) {
        System.out.println(key + " " + contacts.get(key));
    }
    }
}
