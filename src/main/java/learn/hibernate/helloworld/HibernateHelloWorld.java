package learn.hibernate.helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class HibernateHelloWorld {

    public static void main(String[] args) {
        SessionFactory sessionFactory = null;

        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();

        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            System.out.print(e);
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }

        // after set up, good stuff now
        // create people
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save( new People("Tom", 13));
        session.save( new People("Jerry", 7));
        session.getTransaction().commit();
        session.close();

        // pull them from db
        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from People" ).list(); // not people here !
        for (People people : (List<People>) result) {
            System.out.println("People (" + people.getName() + ") : " + people.getAge());
        }
        session.getTransaction().commit();
        session.close();
    }
}
