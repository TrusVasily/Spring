package netcracker.nchostel.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "booking")
public class Booking implements Serializable {
    @Id
    @Column(name = "BookingID")
    @GeneratedValue
    private int BookingID;
    @Column(name = "CustomerID")
    private int CustomerID;
    @Column(name = "RoomID")
    private int RoomID;
    @Column(name = "BookingDate")
    private String BookingDate;
    @Column(name = "DateIN")
    private String DateIN;
    @Column(name = "DateOUT")
    private String DateOUT;
    @Column(name = "Bill")
    private Double Bill;

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int roomID) {
        RoomID = roomID;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String bookingDate) {
        BookingDate = bookingDate;
    }

    public String getDateIN() {
        return DateIN;
    }

    public void setDateIN(String dateIN) {
        DateIN = dateIN;
    }

    public String getDateOUT() {
        return DateOUT;
    }

    public void setDateOUT(String dateOUT) {
        DateOUT = dateOUT;
    }

    public Double getBill() {
        return Bill;
    }

    public void setBill(Double bill) {
        Bill = bill;
    }
}
