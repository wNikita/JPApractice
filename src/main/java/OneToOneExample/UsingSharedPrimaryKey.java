package OneToOneExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsingSharedPrimaryKey {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        User user = new User();
        user.setName("Manu");

        Address address1 = new Address();
        address1.setCity("nashik");
        address1.setZipCode("345678");

        // ASSOCIATE CITIZEN WITH PASSPORT
        address1.setUser(user);

        // ASSOCIATE PASSPORT WITH CITIZEN
        user.setAddress(address1);

        em.persist(user);

//        Query query3 = em.createQuery("delete from User c where c.id=:Id");
//        query3.setParameter("Id", 20).executeUpdate();
        em.getTransaction().commit();
        User pt = em.find(User.class, 12);

        System.out.println("Passport id is " + pt.getId());

        System.out.println("Passport number is " + pt.getName());

        System.out.println("Citizen name is " + pt.getAddress().getCity());
        Address cz = em.find(Address.class, 12);

        System.out.println("Citizen id is " + cz.getId());

        System.out.println("Citizen name is " + cz.getCity());

        System.out.println("Citizen passport number is " + cz.getUser().getName());


        // PASSPORT CAN ACCESS CITIZEN BECAUSE IT IS BIDIRECTIONAL



    }
}
