//package Demo;
//
//import Demo.Address;
//import OneToOneExample.Employee;
//
//import javax.persistence.EntityManager;
//
//import javax.persistence.EntityManagerFactory;
//
//import javax.persistence.Persistence;
//
//
//
//public class EmbeddedExample {
//
//    public static void main(String[] args) {
//
//
//
//        // Create EntityManagerFactory
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//
//
//
//        // Create Entity
//
//        Employee student = new Employee();
//
//        student.setName("Manu");
//
//
//        student.setId(1);
//
//
//
//        Address address = new Address();
//
//        address.setCity("Bangalore");
//
//        address.setState("Karnataka");
//
//        address.setZip("560001");
//
//
//
//        student.setAddress(address);
//
//
//
//        // Create EntityManager
//
//        EntityManager em = emf.createEntityManager();
//
//
//
//        //Remove the record if already exists
//
//        em.getTransaction().begin();
//
//
//
//        em.getTransaction().commit();
//
//
//
//        // Persist entity
//
//        em.getTransaction().begin();
//
//        em.persist(student);
//
//        em.getTransaction().commit();
//
//
//
//        System.out.println("\n~~~~~~~~~~~~~Persisted student record~~~~~~~~~~~~");
//
//    }
//
//}