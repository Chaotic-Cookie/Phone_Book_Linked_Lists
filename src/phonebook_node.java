/*
* Mariam Khatib
* Lab: Phonebook/Linked Lists
* Spring 2020
*
*/

public class phonebook_node {

    //needs to contain: name, address, city, and phone number fields

    //check chapter 15 slides for classes
    //ch 16 for nodes
    //code example in link list part 2, last 5 minutes
    private String name;
    private String email;
    private String phoneNumber;
    private String city;
    private phonebook_node next;

    public phonebook_node() { //makes empty list
        next = null;
    }

    public String getName(){
      return name;
    }

    public String getEmail(){
      return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getCity(){
        return city;
    }

    public String toString(){

        return "Name: " + name + "\nEmail: " + email + "\nPhone number: " + phoneNumber + "\nCity: " + city;
    }




}
