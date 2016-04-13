package vs.hibernate.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import vs.hibernate.models.UserDetails;

public class HibernateTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("Aimee");
		
		Boolean saved = false;
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			session.save(user);
			session.getTransaction();
			saved = true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		if (saved) session.getTransaction().commit();
		
		
		
		
		

	}

}
