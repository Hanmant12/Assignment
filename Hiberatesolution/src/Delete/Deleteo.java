package Delete;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import operation.Examdepartment;

public class Deleteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		Examdepartment ex=new Examdepartment();
		session.delete(ex);
		tra.commit();
	}

}
