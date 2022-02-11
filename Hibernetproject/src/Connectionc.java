

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connectionc {
	private Connectionc() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final SessionFactory sessionFactory;

    static {
        try {
            
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static synchronized SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
