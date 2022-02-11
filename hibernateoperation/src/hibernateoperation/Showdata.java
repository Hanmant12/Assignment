package hibernateoperation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Showdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=fact.openSession();
		Transaction t=session.beginTransaction();
		Criteria Criteria =session.createCriteria(Std.class);
		List<String> lst=Criteria.list();
		System.out.println(lst);
		
	}

}
