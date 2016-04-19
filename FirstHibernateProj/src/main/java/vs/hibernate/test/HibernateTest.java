package vs.hibernate.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import vs.hibernate.dto.Address;
import vs.hibernate.dto.FourWheeler;
import vs.hibernate.dto.TwoWheeler;
import vs.hibernate.dto.UserDetails;
import vs.hibernate.dto.Vehicle;

public class HibernateTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		UserDetails user2 = new UserDetails();
		
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
//		
//		Address addr = new Address();
//		Address addr2 = new Address();
//		
//		addr.setCity("Liedekerke");
//		addr.setStreetName("Begonialaan");
//		addr.setPostcode("1770");
//		addr.setStreetNr("64");
//		user.getListOfAddresses().add(addr);
//		
//		addr2.setCity("Takapuna");
//		addr2.setStreetName("Dominion Street");
//		addr2.setPostcode("0622");
//		addr2.setStreetNr("51A");
//		user.getListOfAddresses().add(addr2);
		
		
//		System.out.println("size: " + user.getListOfAddresses().size());
//		for (Address a : user.getListOfAddresses()){
//			System.out.println("streetName is : " + a.getStreetName());
//		}
//		
		
		user.setUserName("Vincent");
		user2.setUserName("Marc");
//		user.setDate(new Date());
//		user.setDescription("Vincent his description");
		
		TwoWheeler vehicle = new TwoWheeler();
		FourWheeler vehicle2 = new FourWheeler();
		Vehicle vehicle3 = new Vehicle();
		
		
		vehicle.setVehicleName("Aprila");		
		vehicle.setSteeringHandle("handle");
		vehicle2.setVehicleName("Discovery");
		vehicle2.setSteeringWheel("wheel");
		vehicle3.setVehicleName("Car");

		
//		user.getVehicleList().add(vehicle);
//		user.getVehicleList().add(vehicle2);
//		vehicle.getUserdetailList().add(user);
//		vehicle.getUserdetailList().add(user2);
//		
//		user2.getVehicleList().add(vehicle);
//		user2.getVehicleList().add(vehicle2);
//		vehicle2.getUserdetailList().add(user);
//		vehicle2.getUserdetailList().add(user2);
		
//		Collection<Vehicle> vehicleList = new ArrayList<Vehicle>();
//		Collection<UserDetails> userDetailsList = new ArrayList<UserDetails>();
//		
//		vehicleList.add(vehicle);
//		vehicleList.add(vehicle2);
//		
//		user.setVehicles(vehicleList);
//		vehicle.setUserdetailList(userDetailsList);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			session.save(vehicle3);
			session.save(vehicle2);
			session.save(vehicle);
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
