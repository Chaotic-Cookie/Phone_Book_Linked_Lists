/*
* Mariam Khatib
* Lab: Phonebook/Linked Lists
* Spring 2020
* IDE: IntelliJ
*/

public class phonebook_node {

    //needs to contain: name, address, city, and phone number fields

    //check chapter 15 slides for classes
    //ch 16 for nodes
    //code example in link list part 2, last 5 minutes
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String city;
    private phonebook_node next;

    //constructor
    public phonebook_node(String newLastName, String newFirstName, String newAddress,
                          String newCity, String newPhone, phonebook_node newNext){

        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.email = newAddress;
        this.city = newCity;
        this.phoneNumber = newPhone;
        this.next = null;
    }
    public phonebook_node() { //makes empty list
        next = null;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
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

        return "Name: " + firstName + lastName + "\nEmail: " + email +
                "\nPhone number: " + phoneNumber + "\nCity: " + city;
    }


}
