package miniproject2;

import java.util.ArrayList;
import java.util.Locale;

/**
 * @author Kaiya Takahashi
 */

public class ContactList {

    ArrayList<Contact> arrayList = new ArrayList<>();

    /**
     * Default constructor
     */
    ContactList(){
    }

    /**
     * Constructor
     * @param arrayList arraylist of objects of Contact class
     */
    ContactList(ArrayList<Contact> arrayList){
        this.arrayList = arrayList;
    }

    /**
     * Method to add objects to arraylist
     * @param newContact new contact object
     */
    public void addContact(Contact newContact){
        arrayList.add(newContact);
    }

    /**
     * Method to remove object from arraylist
     * @param index the index of object user want to remove
     */
    public void removeContact(int index){
        arrayList.remove(index);
    }

    /**
     * Method to check if there is any duplicate name in the arraylist
     * @param str name to check with
     * @return true if there is any duplicate
     */
    public boolean isDuplicateName(String str){
        str = str.toLowerCase(Locale.ROOT);
        for (Contact contact : arrayList) {
            if (contact.getName().toLowerCase(Locale.ROOT).equals(str)) {
                System.out.println("This name has been registered.");
                return true;
            }
        }
        return false;
    }

    /**
     * Method to check if there is any duplicate mobile in the arraylist
     * @param str mobile number to check with
     * @return true if there is any duplicate
     */
    public boolean isDuplicateMobile(String str){
        for (Contact contact : arrayList) {
            if (contact.getMobile().equals(str)) {
                System.out.println("This mobile has been registered.");
                return true;
            }
        }
        return false;
    }

    /**
     * Method to print all contact objects in the arraylist
     */
    public void printContactList(){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(i + ". " + "<" +
                                arrayList.get(i).getName() + ">" + "(mobile=" +
                                arrayList.get(i).getMobile() +
                                arrayList.get(i).getWork() +
                                arrayList.get(i).getHome() +
                                arrayList.get(i).getCity() + ")");
        }
    }

    /**
     * Method to set the contact details
     * @param newContact new contact object to store the data
     */
    public void setContactDetails(Contact newContact){
        String usernameInput = "";
        boolean isDuplicate = true;
        while(isDuplicate) {
            usernameInput = InputCollector.getUserInput("Enter name: ", true);
            isDuplicate = isDuplicateName(usernameInput);
        }
        newContact.setName(usernameInput);
        isDuplicate = true;
        String userMobileInput = "";
        while(isDuplicate) {
            userMobileInput = InputCollector.getUserInputNumber("Enter mobile without hyphen(-): ", true);
            isDuplicate = isDuplicateMobile(userMobileInput);
        }
        newContact.setMobile(userMobileInput);
        String userWorkInput = InputCollector.getUserInputNumber("Enter Work without hyphen(-): ", false);
        if (!userWorkInput.isBlank()) {
            newContact.setWork(", work=" + userWorkInput);
        }else{
            newContact.setWork("");
        }
        String userHomeInput = InputCollector.getUserInputNumber("Enter Home without hyphen(-): ", false);
        if (!userHomeInput.isBlank()) {
            newContact.setHome(", home=" + userHomeInput);
        }else{
            newContact.setHome("");
        }
        String userCityInput = InputCollector.getUserInput("Enter city: ", false);
        if (!userCityInput.isBlank()) {
            newContact.setCity(", city=" + userCityInput);
        }else{
            newContact.setCity("");
        }
    }
}
