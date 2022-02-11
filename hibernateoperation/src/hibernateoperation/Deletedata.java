package hibernateoperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deletedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=fact.openSession();
		Transaction t=session.beginTransaction();
		//session.delete( 39);
		t.commit();
	}

}
