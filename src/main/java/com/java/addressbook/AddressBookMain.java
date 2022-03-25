package com.java.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	Scanner sc = new Scanner(System.in);
	// creation of arraylist
	ArrayList<Contact> personDetails = new ArrayList<>();

	public void newNewContact(Contact contacts) {
		personDetails.add(contacts);
	}

	public List<Contact> getPersonList() {
		return personDetails;
	}

	public static void main(String[] args) {
		System.out.println("Welcom to Address Book system");

	}
}