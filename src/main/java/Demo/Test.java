//package OneToOneExample;
//
//import javax.persistence.EntityManager;
//
//import javax.persistence.EntityManagerFactory;
//
//import javax.persistence.Persistence;
//
//
//public class Test {
//
//    public static void main(String[] args) {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//
//        EntityManager em = emf.createEntityManager();
//
//
//        em.getTransaction().begin();
//
//
//        Citizen citizen = new Citizen();
//
//        citizen.setCname("Manu");
//
//        Passport passport = new Passport();
//        passport.setPnumber("123456");
//
//        // ASSOCIATE CITIZEN WITH PASSPORT
//        citizen.setPassport(passport);
//
//        // ASSOCIATE PASSPORT WITH CITIZEN
//        passport.setCitizen(citizen);
//
//        em.persist(passport);
//        //em.persist(citizen);
//
//        em.getTransaction().commit();
//
//
//        em.getTransaction().begin();
//
//        // CITIZEN CAN ACCESS PASSPORT
//
//        Citizen cz = em.find(Citizen.class, 130);
//
//        System.out.println("Citizen id is " + cz.getCid());
//
//        System.out.println("Citizen name is " + cz.getCname());
//
//        System.out.println("Citizen passport number is " + cz.getPassport().getPnumber());
//
//
//        // PASSPORT CAN ACCESS CITIZEN BECAUSE IT IS BIDIRECTIONAL
//
//        Passport pt = em.find(Passport.class, 129);
//
//        System.out.println("Passport id is " + pt.getPid());
//
//        System.out.println("Passport number is " + pt.getPnumber());
//
//        System.out.println("Citizen name is " + pt.getCitizen().getCname());
//
//
//        em.getTransaction().commit();
//
//    }
//
//}
