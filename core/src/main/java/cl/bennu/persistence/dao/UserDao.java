package cl.bennu.persistence.dao;

import cl.bennu.common.ms.domain.User;
import cl.bennu.persistence.dao.base.BaseDao;
import cl.bennu.persistence.iface.IUserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao extends BaseDao<User> implements IUserDao {

    @Override
    public User getByEMail(String email) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");


        //creating seession factory object
        SessionFactory factory = cfg.buildSessionFactory();

//creating session object
        Session session = factory.openSession();

//creating transaction object
        Transaction t = session.beginTransaction();

        User user = new User();
        user.setEmail("caca");
        session.persist(user);//persisting the object

        t.commit();//transaction is commited
        session.close();

        return null;
    }


}
