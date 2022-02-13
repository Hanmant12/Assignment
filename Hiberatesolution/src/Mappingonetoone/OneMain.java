package Mappingonetoone;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class OneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		Collage c=new Collage();
		Std s=new Std();
		c.setCname("coc");
		c.setCid(2);
		s.setSname("hanmant");
	
		c.setStds(s);
		session.save(c);
		tra.commit();
	}

}
