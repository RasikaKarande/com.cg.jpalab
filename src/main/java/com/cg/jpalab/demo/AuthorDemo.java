package com.cg.jpalab.demo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AuthorDemo {
	
	

		public static void main(String[] args) {
			System.out.println("Start");

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tr = em.getTransaction();

			tr.begin();

		Author a1 = new Author(101,"Rasika","Karande", "7261978499");
		Author a2 = new Author(102,"Ras","Xyz", "726195252");
		Author a3 = new Author(103,"qwerty","abcd", "9874561230");
		Author a4 = new Author(104,"asd","mnb", "222333252533");
			
//			em.persist(a1); // insert
//			em.persist(a2);
//			em.persist(a3);
//			em.persist(a4);

			a2.setFirstName("Riya");
			em.merge(a2); // update
			System.out.println(a2.toString());
			

			//em.remove(em.find(Author .class, 102)); // delete

	//		Author emp4 = em.find(Author.class, 101); // select
	//		System.out.println(a4.toString());
			tr.commit();

			System.out.println("End");

		}

	
}
