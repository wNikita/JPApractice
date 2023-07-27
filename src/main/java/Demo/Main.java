package Demo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Person person = new Person();
            person.setName("Nikita");

            AddressOfPerson addressOfPerson = new AddressOfPerson();
            addressOfPerson.setCity("nashik");
            addressOfPerson.setPerson(person);

            person.setAddressOfPerson(addressOfPerson);

            em.persist(addressOfPerson);
            em.persist(person);
            em.getTransaction().commit();

            Person cz = em.find(Person.class,26);

            System.out.println("Citizen id is " + cz.getId());

            System.out.println("Citizen name is " + cz.getName());

            System.out.println("Citizen passport number is " + cz.getAddressOfPerson().getCity());

    //address
            AddressOfPerson pt = em.find(AddressOfPerson.class,1);

            System.out.println("Passport id is " + pt.getId());

            System.out.println("Passport number is " + pt.getCity());

            System.out.println("Citizen name is " + pt.getPerson().getName());
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
