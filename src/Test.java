//Name:
//Class: CS 145
//Assignment: Assignment 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

class Phonebook implements Comparable<Phonebook> {
   private String first, last;
   private int phone;

   public Phonebook(String first, String last, int phone)  {
       this.first = first;
       this.last = last;
       this.phone = phone;

   }

   public String getLast() {
       return last;
   }

   public int getPhone() {
       return phone;
   }

   
   public String toString() {// for displaying details
       return "Name: " + first + " " + last + "\nPhone: " + phone;
   }

  
   public int compareTo(Phonebook o) {// using comaparble for sorting purpose
       return last.charAt(0) < o.last.charAt(0) ? -1 : 1;
   }
}

public class Test {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       LinkedList<Phonebook> ll = new LinkedList<>();
       String first, last;
       int phone, choice, count;
       boolean valid;
       // existing contacts
       
       ll.add(new Phonebook("Harry", "Potter", 421563852));
       ll.add(new Phonebook("Steve", "Rogers", 727865925));
       ll.add(new Phonebook("Luke", "Skywalker", 959363530));
       ll.add(new Phonebook("Bruce", "Wayne", 896104896));
       

       while (true) {
           System.out.println();
           System.out.println("1. Add new contact");
           System.out.println("2. Delete contact");
           System.out.println("3. Search contact");
           System.out.println("4. Sort contact");
           System.out.println("5. Print contacts list");
           System.out.println("6. Exit");
           System.out.print("Enter your choice: ");
           choice = Integer.parseInt(br.readLine());

           switch (choice) {

           case 1:// addind contact
               System.out.println();
               System.out.print("Enter first name: ");
               first = br.readLine();
               System.out.print("Enter last name: ");
               last = br.readLine();
               System.out.print("Enter phone number: ");
               phone = Integer.parseInt(br.readLine());
               ll.add(new Phonebook(first, last, phone));
               break;

           case 2: // deleting contact
               System.out.println();
               System.out.print("Enter phone number: ");
               phone = Integer.parseInt(br.readLine());
               valid = true;
               for (Phonebook i : ll) {
                   if (i.getPhone() == phone) {
                       ll.remove(i);
                       System.out.println("Contact deleted successfully");
                       valid = false;
                       break;
                   }
               }
               if (valid)
                   System.out.println("That phone number is not present in contact list");

               break;

           case 3:// searching contact
               System.out.println();
               System.out.print("Enter last name: ");
               last = br.readLine();
               valid = true;
               count = 1;
               for (Phonebook i : ll) {
                   if (last.equalsIgnoreCase(i.getLast())) {
                       System.out.println("Contact #" + count);
                       System.out.println(i.toString());
                       valid = false;
                       count++;
                   }
               }
               if (valid)
                   System.out.println("That last name is not present in contact list");

               break;

           case 4:// sorting contact
               Collections.sort(ll);
               System.out.println("\nSorted successfully");
               break;

           case 5:// showing tge list of contacts
               System.out.println();
               count = 1;
               for (Phonebook i : ll) {
                   System.out.println("Contact #" + count);
                   System.out.println(i.toString());
                   count++;
               }
               break;
           case 6:// exiting
               System.out.println();
               System.out.println("Thank Your for using Phonebook");
               System.exit(0);

           default:
               System.out.println("Invalid input! try again");
               break;
           }
       }
   }
}