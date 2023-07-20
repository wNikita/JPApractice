package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeForTransient {

    public static void main(String[] args) {
        // Create and set up entity manager factory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        try {
            // Create and persist an Employee
            em.getTransaction().begin();

            Customer employee = new Customer();
            employee.setUserName("John Doe");
            employee.setFuel(fuelType.ELECTRONICS);
            employee.setEmail("sdd");

            // Set a transient field (not stored in the database)
            employee.setBoolean(true);

            em.persist(employee);
            em.getTransaction().commit();

            // Fetch the Employee from the database
            em.getTransaction().begin();

            Customer retrievedEmployee = em.find(Customer.class, employee.getUserId());

            // Access the @Transient field (temporary field)
            System.out.println("Name: " + retrievedEmployee.getUserName());
            System.out.println("Age: " + retrievedEmployee.getEmail());
            System.out.println("Temporary Field: " + retrievedEmployee.isBoolean());

            em.remove(retrievedEmployee);
            System.out.println("remove Done");
            em.getTransaction().commit();
        } catch (Exception e) {
            // Handle exceptions
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Close EntityManager and EntityManagerFactory when done
            em.close();
            emf.close();
        }
    }
}
