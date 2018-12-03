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
    @Column(name = "City")
    private String City;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    private String Phone;
    private int EmpoyeeID;

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

    public int getEmpoyeeID() {
        return EmpoyeeID;
    }

    public void setEmpoyeeID(int empoyeeID) {
        EmpoyeeID = empoyeeID;
    }


}
