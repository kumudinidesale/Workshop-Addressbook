package com.java.addressbook;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class AddressBookTest {
	@Test
	public void aContact_ifMatchWithTheListReturnTrue() {
		try {
			Contact person = new Contact("Kumudini", "Desale", "Ankleshwar", "Gujrat", "663392", "956348536", 0, 0);
			AddressBookMain addressBookMain = new AddressBookMain();
			addressBookMain.newNewContact(person);
			List<Contact> result = addressBookMain.getPersonList();
			assertTrue(result.contains(person));
		} catch (Exception e) {
			System.out.println("hotel details not added successfully..");
		}
	}
}
