import java.io.IOException;

public class PhoneBookMain {
    //main has all the values

    public static void main(String[] args) throws IOException {

        while (true) { //menu options
            System.out.println();
            System.out.println("1. Add new contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Search contact");
            System.out.println("4. Sort contact");
            System.out.println("5. Print contacts list");
            System.out.println("6. Exit");
            System.out.print("Please select your choice: ");
            menu = ;
        }//end of while

        switch (menu) {
            case 1://adds contact
                System.out.println("Please enter First and Last name: ");
                System.out.println("Please enter Email Address: ");
                System.out.println("Please enter a Phone number: ");
                System.out.println("Please enter a City: ");
                break;
            case 2://delete contact
            case 3://search contact
            case 4://sort
            case 5://prints list
            case 6://exit
                System.out.println("Thank you for using Yellow Pages.");
                System.exit(0);
            default:
                System.out.println("Invalid option! Please try again.");
                break;
        }//end of switch case
    }//end of main
}//end of class
