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

            System.out.print("Enter name: ");
            String name = scanner.next();
            a.setUserName(name);

            System.out.print("Enter mail: ");
            String mail = scanner.next();
            a.setEmail(mail);


            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(a);
//            Customer customer = em.find(Customer.class, 31);
//            em.remove(customer);
            em.getTransaction().commit();

//            List<Customer> customers = em.createQuery("SELECT c FROM abc c", Customer.class).getResultList();
//
//            for (Customer person : customers) {
//                System.out.println("ID: " + person.getUserId() + ", Name: " + person.getUserName() + ", Email: " + person.getEmail()+",Temp"+person.isBoolean());
//            }

            em.close();
            emf.close();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
