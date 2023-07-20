package Demo;

import javax.persistence.*;

@Entity(name="abc")
@Table(name="user" ,uniqueConstraints={@UniqueConstraint(columnNames  ={"name","mail"})})
public class Customer {


    @Id

    @OrderBy("id DESC")
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private int userId;
    @Column(name = "name")
    private String userName;
    @Column(name = "mail")
    private String Email;

    @Enumerated (EnumType.STRING)
    private fuelType fuel;

    @Transient
    private boolean isBoolean;


    public boolean isBoolean() {
        return isBoolean;
    }

    public void setBoolean(boolean aBoolean) {
        isBoolean = aBoolean;
    }

    @OrderBy("name ASC")
    public int getUserId() {
        return userId;
    }
    public fuelType getFuel() {
        return fuel;
    }

    public void setFuel(fuelType fuel) {
        this.fuel = fuel;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
enum fuelType {
    ELECTRONICS,
    PETROL,
    DIESEL,
    BEAUTY,
    OTHER
}

