package Demo;

import Demo.Person;

import javax.persistence.*;

@Entity
public class AddressOfPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String city;

    @OneToOne(mappedBy = "addressOfPerson",cascade =CascadeType.ALL)
    @JoinColumn(name = "id")
    private Person person;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddressOfPerson{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", person=" + person +
                '}';
    }
}
