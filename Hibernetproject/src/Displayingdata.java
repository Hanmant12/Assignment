import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Displayingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Connectionc.getSessionFactory().openSession();
		 /// Session session = HibernateUtil.getSessionFactory().openSession();
    //   SessionFactory sessionFactory = Connectionc.getSessionFactory();
     //  Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();
       
       Criteria criteria = session.createCriteria(Laptop.class);// for displaying
     //Criteria id = criteria.add(Restrictions.eq("id", 1));
     List<Laptop> list = criteria.list();
     for (Laptop p:list){
         System.out.println(p);
     }
	}

}
