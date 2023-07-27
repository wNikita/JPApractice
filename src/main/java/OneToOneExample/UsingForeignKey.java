package OneToOneExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsingForeignKey {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        Customer customer = new Customer();
        customer.setName("Nikita");

        City city = new City();
        city.setcName("Nashik");

        city.setCustomer(customer);

        customer.setCity(city);

        em.persist(customer);



        em.getTransaction().commit();
        Customer pt = em.find(Customer.class, 6);

        System.out.println("Passport id is " + pt.getId());

        System.out.println("Passport number is " + pt.getName());

        System.out.println("Citizen name is " + pt.getCity().getcName());
        City cz = em.find(City.class, 7);

        System.out.println("Citizen id is " + cz.getId());

        System.out.println("Citizen name is " + cz.getcName());

        System.out.println("Citizen passport number is " + cz.getCustomer().getName());


    }
}


