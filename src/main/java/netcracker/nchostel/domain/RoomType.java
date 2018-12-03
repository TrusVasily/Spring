package netcracker.nchostel.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name= "roomtype")
public class RoomType implements Serializable {
    @Id
    @Column(name = "RoomType")
    private String RoomType;
    @Column(name = "RoomName")
    private String RoomName;
    @Column(name = "Price")
    private double Price;

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

}
