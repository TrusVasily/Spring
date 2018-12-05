package netcracker.nchostel.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name= "hostel")
public class Hostel implements Serializable {
    @Id
    @Column(name = "HostID")
    @GeneratedValue
    private int HostID;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Address")
    private String Address;
    @Column (name = "Phone")
    private String Phone;
    @Column(name = "City")
    private String City;
    @Column (name = "EmployeeID")
    private int EmployeeID;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getHostID() {
        return HostID;
    }

    public void setHostID(int hostID) {
        HostID = hostID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }


}
