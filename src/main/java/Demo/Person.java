package Demo;

import Demo.AddressOfPerson;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToOne()
    @PrimaryKeyJoinColumn
    private AddressOfPerson addressOfPerson;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressOfPerson=" + addressOfPerson +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressOfPerson getAddressOfPerson() {
        return addressOfPerson;
    }

    public void setAddressOfPerson(AddressOfPerson addressOfPerson) {
        this.addressOfPerson = addressOfPerson;
    }
}
