package com.qa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountRepositoryDB implements AccountRepository{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
	
			public void add (Account account) {
				
				et.begin();
				em.persist(account);
				et.commit();
				
			}
			
			
			public Account retrieve(int id) {
				
			return em.find(Account.class, id);
				
			}
			
			
			public Account updatefirstName(int id, String newfirstName) {
				et.begin();
				Account account = retrieve(id);
				account.setFirstName(newfirstName);
				et.commit();
				return account;
				
			}
			
//			public void removeUpdate(int id) {
//				Account account = retrieve(id);
//				account.
//				
//			}
//			
		

}
