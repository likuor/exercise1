package miniproject2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kaiya Takahashi
 */

public class Driver {


    public static void main(String[] args){

        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);

        boolean endTheApplication = false;
        boolean invalidInput;

        while (!endTheApplication) {
            System.out.println("""
                    +====  Contact App ====+
                    | 1. List all Contacts |
                    | 2. Add new Contact   |
                    | 3. Remove Contact    |
                    | 4. Update Contact    |
                    | 5. Quit              |
                    +======================+""");
            String userNumberInput = InputCollector.getUserInput("Enter your option: ");
            switch (userNumberInput) {
                case "1":
                    contactList.printContactList();
                    break;
                case "2":
                    Contact contact = new Contact();
                    contactList.setContactDetails(contact);
                    contactList.addContact(contact);
                    System.out.println("Successfully added a new contact!");
                    break;
                case "3":
                    if (contactList.arrayList.isEmpty()){
                        System.out.println("There is no contact in the list.");
                    }else {
                        contactList.printContactList();
                        invalidInput = true;
                        while (invalidInput) {
                            try {
                                System.out.print("Enter the index of contact to remove: ");
                                int indexOfContact = scanner.nextInt();
                                System.out.println("Successfully remove " + contactList.arrayList.get(indexOfContact).getName());
                                contactList.removeContact(indexOfContact);
                                invalidInput = false;
                            } catch (IndexOutOfBoundsException e) {
                                int numberRange = contactList.arrayList.size() - 1;
                                System.out.println("Invalid input. Enter number between 0 and " + numberRange);
                            } catch (InputMismatchException e){
                                int numberRange = contactList.arrayList.size() - 1;
                                System.out.println("Invalid input. Enter number between 0 and " + numberRange);
                                scanner.next();
                            }
                        }
                    }
                    break;
                case "4":
                    if (contactList.arrayList.isEmpty()){
                        System.out.println("There is no contact in the list.");
                    }else {
                        contactList.printContactList();
                        invalidInput = true;
                        while (invalidInput) {
                            try {
                                System.out.print("Enter the index of contact to update: ");
                                int indexOfContact = scanner.nextInt();
                                contactList.setContactDetails(contactList.arrayList.get(indexOfContact));
                                System.out.println("Successfully updated");
                                invalidInput = false;
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Enter the valid input");
                            } catch (InputMismatchException e){
                                System.out.println("Enter the valid input");
                                scanner.next();
                            }
                        }
                    }
                    break;
                case "5":
                    System.out.println("Bye!");
                    endTheApplication = true;
                    break;
                default:
                    System.out.println("Enter number between 1 and 5.");
                    break;
            }
        }
    }
}
