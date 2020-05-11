/*
 * Mariam Khatib
 * Lab: Phonebook/Linked Lists
 * Spring 2020
 * IDE: IntelliJ
 */

import java.io.IOException;
import java.util.Scanner;

public class PhoneBookMain {
    //main has all the values

    public static void main(String[] args) throws IOException {
        Scanner book = new Scanner(System.book);
        phonebook_node List = new phonebook_node();

        Integer menu;
        boolean finished = false;

        while (true) { //menu options
            System.out.println();
            System.out.println("1. Add new contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Search contact");
            System.out.println("4. Sort contact");
            System.out.println("5. Print contacts list");
            System.out.println("6. Exit");
            System.out.print("Please select your choice: ");
            menu = Integer.parseInt();
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


                break;

            case 2://delete contact
                System.out.println("Please enter Index number: ");
                int delete = book.nextInt();

                break;

            case 3://search contact
                System.out.println("Please enter the Name to search for: ");

                break;

            case 4://sort
                System.out.println("Please enter the Name to search for: ");
                break;

            case 5://prints list
                System.out.println("Printing Phonebook.");
                List.print();
                break;

            case 6://exit
                System.out.println("Thank you for using Yellow Pages.");
                System.exit(0);

            default:
                System.out.println("Invalid option! Please try again.");
                break;
        }//end of switch case
    }//end of main
}//end of class