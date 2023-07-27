//package OneToOneExample;
//
//import javax.persistence.*;
//
//
//@Entity
//
//@Table(name = "PASSPORT")
//
//public class Passport {
//
//
//    @Id
//
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "PID")
//    private int pid;
//
//
//    @Column(name = "PNUMBER")
//
//    private String pnumber;
//
//
////    @OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
////    private Citizen citizen;
//
//
//    //setters and getters
//
//    public int getPid() {
//
//        return this.pid;
//
//    }
//
//    public void setPid(int pid) {
//
//        this.pid = pid;
//
//    }
//
//    public String getPnumber() {
//
//        return this.pnumber;
//
//    }
//
//    public void setPnumber(String pnumber) {
//
//        this.pnumber = pnumber;
//
//    }
//
//    public Citizen getCitizen() {
//
//        return citizen;
//
//    }
//
//    public void setCitizen(Citizen citizen) {
//
//        this.citizen = citizen;
//
//    }
//
//}