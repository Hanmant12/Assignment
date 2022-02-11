package embeddableannota;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				SessionFactory fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session=fact.openSession();
				Transaction t=session.beginTransaction();
				Course c=new Course();
				c.setName("python");
				Project p=new Project(c);
				p.setGroup("topper");
				p.setCourse(c);
				//session.save(c);
				session.save(p);
				t.commit();
				
	}

}
