package OneToOneExample;

import javax.persistence.*;
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String cName;

    @OneToOne(mappedBy = "city",orphanRemoval = true,cascade = CascadeType.REMOVE)
    private Customer customer;

    public int getId() {
        return id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

