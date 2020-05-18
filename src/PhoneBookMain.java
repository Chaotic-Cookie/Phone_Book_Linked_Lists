/*
 * Mariam Khatib
 * Lab: Phonebook/Linked Lists
 * Spring 2020
 * IDE: IntelliJ
 */

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {
    //main has all the values
    public static Scanner book = new Scanner(System.in);
    private static List phonebook_node;

    public static void main(String[] args) throws IOException {

        phonebook_node List = new phonebook_node();
        phoneBookManager Bellingham = new phoneBookManager();

        int menu = 0;
        boolean finished = false;


        while (menu != 5 || menu < 5) { //menu options
            System.out.println();
            System.out.println("1. Add new contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Search contact");
            System.out.println("4. Print contacts list");
            System.out.println("5. Exit");
            System.out.print("Please select your choice: ");
            String response = book.nextLine();
            menu = Integer.parseInt(response);
            System.out.println(menu);
            System.out.println(response);
        }//end of while

        switch (menu) {
            case 1://adds contact
                System.out.println("Please enter First name: ");
                String firstName = book.nextLine();

                System.out.println("Please enter Last name: ");
                String lastName = book.nextLine();

                System.out.println("Please enter Email Address: ");
                String email = book.nextLine();

                System.out.println("Please enter a Phone number: ");
                String phoneNumeber = book.nextLine();

                System.out.println("Please enter a City: ");
                String city = book.nextLine();
                phonebook_node contactNode = new phonebook_node(lastName, firstName, email, phoneNumeber, city);
                Bellingham.add(contactNode);
                break;

            case 2://delete contact
                System.out.println("Please enter Last Name: ");
                String to_delete = book.nextLine();
                Bellingham.delete(to_delete);
                break;

            case 3://search contact
                System.out.println("Please enter the Name to search for: ");
                String to_search = book.nextLine();
                Bellingham.searchName(to_search);
                break;

            case 4://prints list
                System.out.println("Printing Phonebook.");
                Bellingham.print();
                break;

            case 5://exit
                System.out.println("Thank you for using Yellow Pages.");
                System.exit(0);

            default:
                System.out.println("Invalid option! Please try again.");
                break;
        }//end of switch case
    }//end of main
}//end of class
