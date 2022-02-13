package onetomanypractice;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MainAp {
	
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
	
	
	Session session=fact.openSession();
	
	org.hibernate.Transaction tra=session.beginTransaction();
	City c=new City();

	c.setName("delhi");
	City c1=new City();
	c1.setName("pune");
	
	
	School sc=new School();
	sc.setName("collabera");
	
	
	sc.getCity().add(c);
	sc.getCity().add(c1);
	session.save(c);
	session.save(c1);

	session.save(sc);
	tra.commit();
	
}
}
