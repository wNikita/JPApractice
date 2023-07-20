package Demo;



import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.IdClass;

import javax.persistence.Table;



@Entity

@Table(name = "STUDENT")

@IdClass(StudentId.class)

public class Student {

    @Id

    private int id;



    private String firstName;



    private String lastName;



    @Id

    private int marks;



    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public int getMarks() {

        return marks;

    }

    public void setMarks(int marks) {

        this.marks = marks;

    }

}