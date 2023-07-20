package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Scanner;

public class PracticeMain {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Customer a = new Customer();

//            System.out.print("Enter id: ");
//            int id = Integer.parseInt(scanner.next());
//            a.setUserId(id);
//
            System.out.print("Enter name: ");
            String name = scanner.next();
            a.setUserName(name);

            System.out.print("Enter mail: ");
            String mail = scanner.next();
            a.setEmail(mail);
//
//            scanner.close();

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();

            // Persist the new Customer entity to the database
           em.persist(a);

            // Commit the transaction to save the changes
           em.getTransaction().commit();

            // Query all users including the newly added one
            List<Customer> customers = em.createQuery("SELECT c FROM abc c", Customer.class).getResultList();

            // Print all users
            for (Customer person : customers) {
                System.out.println("ID: " + person.getUserId() + ", Name: " + person.getUserName() + ", Email: " + person.getEmail()+",Temp"+person.isBoolean());
            }

            em.close();
            emf.close();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
