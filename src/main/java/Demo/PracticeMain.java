//package OneToOneExample;
//
//import Demo.Address;
//import OneToOneExample.Employee;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class PracticeMain {
//    public static void main(String[] args) {
//        try {
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//            EntityManager em = emf.createEntityManager();
//            em.getTransaction().begin();
//
//            //select query
////            Query query = em.createQuery("Select c.name from Employee c ");
////            List<String> list = query.getResultList();
////            System.out.println("Student Name :");
////            for (String s : list) {
////                System.out.println(s);
////            }
////
////            //update
////            Query query1 = em.createQuery(
////                    "UPDATE Employee  e SET e.name=:p WHERE e.id=2");
////            query1.setParameter("p", "nikita").executeUpdate();
////
////
////            //select with where
////            Query query2 = em.createQuery("select e.name from Employee e where e.id=:id");
////            query2.setParameter("id", 5);
////            List<String> list1 = query2.getResultList();
////            System.out.println("Student Name according to id:");
////            for (String s : list1) {
////                System.out.println(s);
////            }
////
////
////            //delete
////            Query query3 = em.createQuery("delete from Employee c where c.id=:Id");
////            query3.setParameter("Id", 3).executeUpdate();
////
//
//            Employee employee=new Employee();
//            employee.setName("aarti");
//
//            Address address=new Address();
//            address.setCity("pune");
//            address.setState("bugsgs");
//            address.setZip("6789");
//            employee.setAddress(address);
//            em.persist(address);
//            em.persist(employee);
//            em.getTransaction().commit();
//            Employee cz = em.find(Employee.class, 70);
//
//            System.out.println("Id is " + cz.getId());
//
//            System.out.println("Name is " + cz.getName());
//
//            System.out.println("City is " + cz.getAddress().getCity());
//
//            em.close();
//            emf.close();
//        } catch (Exception e) {
//            System.out.println("Error occurred: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
////            List<Customer> customers = em.createQuery("SELECT c FROM abc c", Customer.class).getResultList();
////
////            for (Customer person : customers) {
////                System.out.println("ID: " + person.getUserId() + ", Name: " + person.getUserName() + ", Email: " + person.getEmail()+",Temp"+person.isBoolean());
////            }
//
////            Customer customer = em.find(Customer.class, 31);
////            em.remove(customer);