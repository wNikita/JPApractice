package Demo;


import javax.persistence.EntityManager;

        import javax.persistence.EntityManagerFactory;

        import javax.persistence.Persistence;



public class IdclassExample {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Student student = new Student();

        student.setFirstName("sak");

        student.setLastName("bar");

        student.setId(3);

        student.setMarks(200);

        em.persist(student);

        em.getTransaction().commit();

        em.getTransaction().begin();

//       em.remove(student);

        em.getTransaction().commit();

    }

}

