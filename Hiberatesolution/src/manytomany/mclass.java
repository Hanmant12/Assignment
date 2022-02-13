package manytomany;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class mclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

org.hibernate.SessionFactory fact= new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		Project p=new Project();
		Project p2=new Project();
		
		employee em=new employee();
		employee e1=new employee();
		
		p.setPid(11);
		p.setPname("iit");
		p2.setPid(22);
		p2.setPname("work");
		
		em.setEid(23);
		em.setEname("pqr");
		e1.setEid(24);
		e1.setEname("xyz");
		
		p.getEmp().add(e1);
		p2.getEmp().add(em);
		e1.getProject().add(p2);
		em.getProject().add(p2);
		
		session.save(p);
		session.save(p2);
		session.save(em);
		session.save(e1);
		tra.commit();
		
		
		
	}

}
