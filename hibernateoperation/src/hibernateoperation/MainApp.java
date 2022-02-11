package hibernateoperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=fact.openSession();
		Transaction t=session.beginTransaction();
		Std s=new Std();
		s.setClg("Tcs");
		session.save(s);
		t.commit();
		
		
	}

}
