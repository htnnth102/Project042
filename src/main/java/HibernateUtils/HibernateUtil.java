package HibernateUtils;

import Model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory factory;
    static Configuration config = new Configuration();
    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            try {
//                Configuration config = new Configuration();
                Properties setting = new Properties();
                setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                setting.put(Environment.URL, "jdbc:mysql://localhost:3306/project401");
                setting.put(Environment.USER, "root");
                setting.put(Environment.PASS, "motconvit");
                setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

                setting.put(Environment.SHOW_SQL, "true");


                config.setProperties(setting);
                config.addAnnotatedClass(User.class);

                factory = config.buildSessionFactory();
                return  factory;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return factory;
    }
}
