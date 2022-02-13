package Mapping;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Mnp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		One o=new One();
		Two t=new Two();
		o.setName("tushar");
		o.setPone(12345);
		t.setTname("ajinky");
		//o.setTwo(t);
		session.save(t);
       
		session.save(o);
		tra.commit();
		
	}

}
