package vs.hibernate.test;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import vs.hibernate.dto.Vehicle;

public class SearchTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			Criteria criteria = session.createCriteria(Vehicle.class);
			criteria.add(Restrictions.like("vehicleName", "%a%"));
			List<Vehicle> list = criteria.list();
			System.out.println("list size:" + list.size());
			for (Vehicle item: list){
				System.out.println("item id:" + item.getVehicleId());
				System.out.println("item name:" + item.getVehicleName());
			}

			session.getTransaction().commit();
			

			
			
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
