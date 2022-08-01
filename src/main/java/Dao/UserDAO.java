package Dao;

import HibernateUtils.HibernateUtil;
import Model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public List<User> getAllUsers() {
        List<User> lstUser = new ArrayList<User>();
        Transaction tx = null;
        try ( Session ss = HibernateUtil.getSessionFactory().openSession())
        {
          tx = ss.beginTransaction();
          lstUser = ss.createQuery("from User").getResultList();
          tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }


        return lstUser;
    }
}
