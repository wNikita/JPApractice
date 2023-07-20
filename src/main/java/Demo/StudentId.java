package Demo;


import java.io.Serializable;

import javax.persistence.Id;



public class StudentId implements Serializable {



    @Id

    private int id;



    @Id

    private int marks;



    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public int getMarks() {

        return marks;

    }

    public void setMarks(int marks) {

        this.marks = marks;

    }



    @Override

    public int hashCode() {

        final int prime = 31;

        int result = 1;

        result = prime * result + id;

        result = prime * result + marks;

        return result;

    }

    @Override

    public boolean equals(Object obj) {

        if (this == obj)

            return true;

        if (obj == null)

            return false;

        if (getClass() != obj.getClass())

            return false;

        StudentId other = (StudentId) obj;

        if (id != other.id)

            return false;

        if (marks != other.marks)

            return false;

        return true;

    }

}