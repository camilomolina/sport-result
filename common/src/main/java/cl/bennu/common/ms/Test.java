package cl.bennu.common.ms;

import cl.bennu.common.ms.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by Mac on 09.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        User user = new User();
        //user.setId(new Long(1));
        user.setName("Hello world task");

        session.save(user);
        tx.commit();
        session.close();
    }
}
