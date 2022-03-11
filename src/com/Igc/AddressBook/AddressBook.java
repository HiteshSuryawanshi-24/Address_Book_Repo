package com.Igc.AddressBook;
import java.util.Scanner;

public class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    public void addContact(){
        System.out.println("Enter the First Name:");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name:");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address:");
        contact.setAddress(sc.next());
        System.out.println("Enter the City Name:");
        contact.setCity(sc.next());
        System.out.println("Enter the State Name:");
        contact.setState(sc.next());
        System.out.println("Enter the Zip No:");
        contact.setZip(sc.next());
        System.out.println("Enter the Phone Number:");
        contact.setPhoneno(sc.next());
        System.out.println("Enter the Email Id:");
        contact.setEmailId(sc.next());
    }
    public void displayContact(){
        try {
            System.out.println(contact.toString());
        }catch (NullPointerException np)
        {
            System.out.println("Contact Not Exist !!");
        }
    }
    public void editContact(){
        System.out.println("Edit Contatct");
        System.out.println("Enter the Name to check contact");
        String name= sc.next();

        if (name.equalsIgnoreCase(contact.getFirstName())){
            System.out.println("Contact Found !!");
            System.out.println("Enter the First Name:");
            contact.setFirstName(sc.next());
            System.out.println("Enter the Last Name:");
            contact.setLastName(sc.next());
            System.out.println("Enter the Address:");
            contact.setAddress(sc.next());
            System.out.println("Enter the City Name:");
            contact.setCity(sc.next());
            System.out.println("Enter the State Name:");
            contact.setState(sc.next());
            System.out.println("Enter the Zip No:");
            contact.setZip(sc.next());
            System.out.println("Enter the Phone Number:");
            contact.setPhoneno(sc.next());
            System.out.println("Enter the Email Id:");
            contact.setEmailId(sc.next());
        }
        else {
            System.out.println("Contact Not Found !!");
        }
    }
    public void deleteContact(){
        System.out.println("Enter the First Name For Delete Contact");
        String name = sc.next();
        try {
            if(name.equalsIgnoreCase(contact.getFirstName())){
                System.out.println("Contact Found !!");
                contact = null;
                System.out.println("Contact Deleted successfully");
            }else {
                System.out.println("Contact Not Found !");
            }
        }catch (NullPointerException np)
        {
            System.out.println("Contact Not Found !");
        }

    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("\nWELCOME TO ADDRESS BOOK MENU");
            System.out.println("1.ADD NEW CONTACT\n2.EDIT CONTACT\n3.SHOW CONTACT\n4.DELETE CONTACT\n5.EXIT");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.displayContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice No..!");
                    break;
            }
        }while (choice != 5);
    }
}
