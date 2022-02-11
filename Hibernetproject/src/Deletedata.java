import org.hibernate.Session;
import org.hibernate.Transaction;

public class Deletedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Connectionc.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
        Person person=new Person();
       
        person.setName("123");
        person.setName("raje");
        session.delete(person);
        session.save(person);
        
	}

}
