package Update;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import operation.Examdepartment;

public class Update {

	public static void main(String[] args)
	{
	org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	
	Session session=fact.openSession();
	
	org.hibernate.Transaction tra=session.beginTransaction();
	
	Examdepartment ex=new Examdepartment();
	ex.setId(6);
	ex.setSubject("python");
	session.update(ex);
	tra.commit();
	
}
}