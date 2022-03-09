package com.Igc.AddressBook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
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
        System.out.println(contact.toString());
    }


    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();
    }
}
