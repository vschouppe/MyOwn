package vs.hibernate.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import vs.hibernate.dto.Address;
import vs.hibernate.dto.UserDetails;

public class HibernateTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		
//		Address homeAddress = new Address();
//		Address officeAddress =  new Address();
//		homeAddress.setCity("Liedekerke");
//		homeAddress.setStreetName("Begonialaan");
//		homeAddress.setPostcode("1770");
//		homeAddress.setStreetNr("64");
//		
//		officeAddress.setCity("Takapuna");
//		officeAddress.setStreetName("Dominion Street");
//		officeAddress.setPostcode("0622");
//		officeAddress.setStreetNr("51A");
//		user.setOfficeAddress(officeAddress);
//		user.setHomeAddress(homeAddress);
		
		Address addr = new Address();
		Address addr2 = new Address();
		
		addr.setCity("Liedekerke");
		addr.setStreetName("Begonialaan");
		addr.setPostcode("1770");
		addr.setStreetNr("64");
		user.getListOfAddresses().add(addr);
		
		addr2.setCity("Takapuna");
		addr2.setStreetName("Dominion Street");
		addr2.setPostcode("0622");
		addr2.setStreetNr("51A");
		user.getListOfAddresses().add(addr2);
		
		
		System.out.println("size: " + user.getListOfAddresses().size());
		for (Address a : user.getListOfAddresses()){
			System.out.println("streetName is : " + a.getStreetName());
		}
		
		user.setUserName("Vincent");
		user.setDate(new Date());
		user.setDescription("Vincent his description");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			session.save(user);
			session.getTransaction();
			session.getTransaction().commit();
			
			user = null;
			session.beginTransaction();
			user = session.get(UserDetails.class, 1);
			
			
			
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("Issue occured!!");
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		
		

		
		
		
		
		
		
		

	}

}
