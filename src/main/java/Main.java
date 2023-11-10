import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory factory = metadata.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        String command = "FROM " + Purchase.class.getSimpleName();
        String studentFinder = "FROM " + Student.class.getSimpleName() + " WHERE name = ";
        String courseFinder = "FROM " + Course.class.getSimpleName() + " WHERE name = ";

        EntityManager manager = session.getEntityManagerFactory().createEntityManager();
        List<Purchase> purchases = manager.createQuery(command, Purchase.class).getResultList();

        for (Purchase purchase : purchases) {
            String studentName = purchase.getPurKey().getStudentName();
            String courseName = purchase.getPurKey().getCourseName();

            List<Student> studentList = manager.createQuery(studentFinder + "'" + studentName + "'", Student.class)
                    .getResultList();
            List<Course> courseList = manager.createQuery(courseFinder + "'" + courseName + "'", Course.class)
                    .getResultList();

            int studentId = studentList.get(0).getId();
            int courseId = courseList.get(0).getId();

            LinkedPurchase linkedPurchase = new LinkedPurchase(studentId, courseId);
            session.persist(linkedPurchase);
        }
        transaction.commit();
        factory.close();
    }
}
