package HibernateOnetomany;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;



public class Maina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		Mark m=new Mark();
		
		m.setName("java");
		Mark m1=new Mark();
		m1.setName("python");
	
		Departmnt d=new Departmnt();
		d.setName("itone");
//		d.setDid(2);
		d.getMark().add(m);
		d.getMark().add(m1);
	
		
		session.save(d);
		session.save(m);
		session.save(m1);
		tra.commit();
		
		
	}

}
