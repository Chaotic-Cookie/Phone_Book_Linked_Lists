/*
 * Mariam Khatib
 * Lab: Phonebook/Linked Lists
 * Spring 2020
 *IDE: IntelliJ
 */


public class phoneBookManager {
    //needs to add an entry (name, address, city, phone #) to the end and then sort it, or alphabetically by last name
    // modify the entry, delete entries, or move them from the Bellingham to the Seattle phone book (optional)
    //print out your list in a nice format


    private phonebook_node start;
    private int size;
    private int current;

    public phoneBookManager(){ //creates an empty node

        start = null;
        size = 0;
    }


    public void add(phonebook_node node){

        phonebook_node newBook = new phonebook_node();
        phonebook_node now = start;
        phonebook_node past = null;


        if(start == null){
            start = newBook;

        }else{
            current = start;
            while(current.next != null){
                current = first;
                current = current.next;

            }
            current.next = node;

        }
        System.out.println();

    }

    public void delete(){

    }

    public void searchEmail(String email){
        if(start == null){
            System.out.println("This list is empty.");
        }else{

        }
        System.out.println();



    }

    public void searchName(){
        if(start == null){
            System.out.println("This list is empty.");
        }else{

        }
        System.out.println();

    }

    public void sort(){
        if(start == null){
            System.out.println("This list is empty.");
        }else{

        }
        System.out.println();
    }

    public void print(){
        if(start == null){
            System.out.println("This list is empty.");
        }else{

        }
        System.out.println();
    }



}
