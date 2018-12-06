package netcracker.nchostel.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "employee")
public class Employee implements Serializable {
    @Id
    @Column(name = "EmployeeID")
    private int EmployeeID;
    @Column(name = "FirstName")
    private String FirstName;
    @Column(name = "LastName")
    private String LastName;
    @Column(name = "Address")
    private String Address;
    @Column(name = "Phone")
    private String Phone;

    public int getEmployeeID() {
        return EmployeeID;
    }
    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String  getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

}

