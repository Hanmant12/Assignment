package Embeddedexample;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		
		Type t=new Type();
		t.setId(1);
		t.setName("hanmant");
		//t.setName("ra");
		Type t1=new Type();
		t1.setId(2);
		t1.setName("om");
		//t1.setName("ra");
		
		//session.save(t);
		Tyre t2=new Tyre();
		t2.setTname("raje");
		//t2.setTyre()
		
		session.save(t);
		session.save(t1);
		session.save(t2);
		t2.setTyre(t1);
		t2.setTyre(t);
		tra.commit();
		
	}

}
