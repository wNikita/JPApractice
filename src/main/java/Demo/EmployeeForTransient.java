//package Demo;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class EmployeeForTransient {
//
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//
//            Customer employee = new Customer();
//            employee.setUserName("dfrgth");
//            employee.setFuel(fuelType.ELECTRONICS);
//            employee.setEmail("before");
//
//            employee.setBoolean(true);
//
//            em.persist(employee);
//            em.flush();
//            employee.setEmail("after");
//            em.getTransaction().commit();
//
//            em.getTransaction().begin();
//
//            Customer retrievedEmployee = em.find(Customer.class, employee.getUserId());
//            System.out.println("merge example:"+em.merge(retrievedEmployee));
//
//            // Access the @Transient field (temporary field)
//            System.out.println("Name: " + retrievedEmployee.getUserName());
//            System.out.println("Age: " + retrievedEmployee.getEmail());
//            System.out.println("Temporary Field: " + retrievedEmployee.isBoolean());
//
//
//            em.flush();
//        } catch (Exception e) {
//            // Handle exceptions
//            if (em.getTransaction().isActive()) {
//                em.getTransaction().rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            // Close EntityManager and EntityManagerFactory when done
//            em.close();
//            emf.close();
//        }
//    }
//}
