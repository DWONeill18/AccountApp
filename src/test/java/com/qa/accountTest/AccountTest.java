package com.qa.accountTest;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.AccountRepositoryMap;


public class AccountTest {

	@Test
	public void createAccount() {
		
	
		Account account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNum(3);
		
		int id = account.getId();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		int accountNum = account.getAccountNum();
	
		assertEquals("wrong id", 0 , id);
		assertEquals("wrong firstName", "Chris", firstName);
		assertEquals("wrong lastName", "Perrins", lastName);
		assertEquals("wrong accountNum", 3, accountNum);
		
	}
	
	@Test
	public void accountRepositioryMapTest() {
		
		AccountRepositoryMap arm = new AccountRepositoryMap();	
		Account a = new Account();
		int id = 2;
		a.setId(id);
		a.setFirstName("Chris");
		arm.add(a);
		Account retrieved = arm.retrieve(id);
		
		assertEquals("Wrong Account Retrieved", "Chris", retrieved.getFirstName());
		assertEquals("Wrong Account Retrieved", a, retrieved);
			
		}
		
	}
	
	
		
	

