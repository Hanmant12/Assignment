package operation;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class MainApp {

	public static void main(String[] args) {
		
org.hibernate.SessionFactory fact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		org.hibernate.Transaction tra=session.beginTransaction();
		Examdepartment ex=new Examdepartment();
		//ex.setSubject("math");
		ex.setSubject("java");
		session.save(ex);
		 tra.commit();
		System.out.println(ex.getId());
		
	}
}
