package Display;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import operation.Examdepartment;

public class Displayma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		
		Criteria ca=session.createCriteria(Examdepartment.class);
		
	
		List<String> lst=ca.list();
		System.out.println(lst);
		Examdepartment user = (Examdepartment) session.get(Examdepartment.class, new Integer(6));
		System.out.println(user);
	}

}
