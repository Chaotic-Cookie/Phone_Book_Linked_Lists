/*
 * Mariam Khatib
 * Lab: Phonebook/Linked Lists
 * Spring 2020
 *IDE: IntelliJ
 */


import java.util.Collection;
import java.util.Collections;

public class phoneBookManager {
    //needs to add an entry (name, address, city, phone #) to the end and then sort it, or alphabetically by last name
    //modify the entry, delete entries, or move them from the Bellingham to the Seattle phone book (optional)
    //print out your list in a nice format


    private phonebook_node start;
    private int size;

    public phoneBookManager(){ //creates an empty node

        start = null;
        size = 0;
    }


    public void add(phonebook_node node){

        phonebook_node current;
        phonebook_node first = new phonebook_node();
        if(start == null){
            start = node;

        }else{
            current = start;
            while(current.next != null){

                current = first;
                current = current.next;

            }
            current.next = node;
            size++;
        }
        System.out.println();

    }

    public void delete(phonebook_node node){
        phonebook_node current;
        boolean search = false;
        if(start == null){
            start = node;

        }else{
            current = start;
            while(current.next != null && !search){

                current = current.next ;

            }
            current.next = node;
            size--;
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


            System.out.println("This list has been sorted!");

        }
        System.out.println();
    }

    public void print(){
        phonebook_node current = null;
        if(start == null){
            System.out.println("This list is empty.");

        }else{
           while(current.next != null){

               current = current.next;

           }

        }
        System.out.println();
    }


    /* for(int i = 0; i < size; i++){
        System.out.print("Index #: " + (i+1) + " ");
        System.out.println(temp);
        temp = temp.next;
        */

}//end of manager
