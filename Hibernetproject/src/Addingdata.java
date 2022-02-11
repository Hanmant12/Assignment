import org.hibernate.Session;
import org.hibernate.Transaction;

public class Addingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Connectionc.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
        Person person=new Person();
       
        person.setName("123");
        person.setName("raje");
        session.save(person);
        
        Contact c=new Contact(2,"hey");
        c.setPhone("95616426");
        c.setEmail("rajehanmant@gmail.com");
       // c.setContenctType();
    
        session.save(c);
        Projectde p=new Projectde();
        p.setProjectName("java");
        p.setContactPerson("hanmant");
        session.save(p);
        Laptop lp=new Laptop();
        lp.setHdd("core");
        lp.setCpu("latest");
       session.save(lp);
       person.setName("raju");
       person.setPhone("585858");
       session.save(person);
	}

}
