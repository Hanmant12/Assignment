import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApponetomany {

	public static void main(String[] args)
	{
		Session session=Connectionc.getSessionFactory().openSession();
		 /// Session session = HibernateUtil.getSessionFactory().openSession();
     //   SessionFactory sessionFactory = Connectionc.getSessionFactory();
      //  Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//       Employee et=new Employee();
//       et.setDepartmentName("it");
//       et.setAddress("pune");
       
       List<Contact> contactDetails=new ArrayList<>();

       Contact c=new Contact(1,"abc");
       contactDetails.add(c);
       
   
       session.save(c);
       Employee e=new Employee();
       e.setContactDetails(contactDetails);
       e.setAddress("pune");
       session.save(e);
       
       
       
        transaction.commit();
        session.close();           // Optional
          // Optional
        
        
	}
}
