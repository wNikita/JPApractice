//package OneToOneExample;
//
//import OneToOneExample.Passport;
//
//import javax.persistence.*;
//
//@Entity
//
//@Table(name = "CITIZEN")
//
//public class Citizen {
//
//
//    @Id
//
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "CID")
//    private int cid;
//
//
//    @Column(name = "CNAME")
//
//    private String cname;
//
//    @OneToOne(cascade=CascadeType.ALL)
//    private Passport passport;
//
//
//    public int getCid() {
//
//        return this.cid;
//
//    }
//
//    public void setCid(int cid) {
//
//        this.cid = cid;
//
//    }
//
//    public String getCname() {
//
//        return this.cname;
//
//    }
//
//
//    public void setCname(String cname) {
//
//        this.cname = cname;
//
//    }
//
//    public Passport getPassport() {
//
//        return passport;
//
//    }
//
//    public void setPassport(Passport passport) {
//
//        this.passport = passport;
//
//    }
//
//}
//
