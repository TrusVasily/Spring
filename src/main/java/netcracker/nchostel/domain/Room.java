package netcracker.nchostel.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name= "room")
public class Room implements Serializable {
    @Id
    @Column(name = "RoomID")
    @GeneratedValue
    private int RoomID;
    @Column(name = "RoomType")
    private String RoomType;
    @Column(name = "RoomDescription")
    private String RoomDescription;
    @Column(name = "HotelID")
    private int HotelID;

    public void setRoomID(int roomID) {
        RoomID = roomID;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public void setRoomDescription(String roomDescription) {
        RoomDescription = roomDescription;
    }

    public void setHotelID(int hotelID) {
        HotelID = hotelID;
    }

    public int getRoomID() {
        return RoomID;
    }

    public String getRoomType() {
        return RoomType;
    }

    public String getRoomDescription() {
        return RoomDescription;
    }

    public int getHotelID() {
        return HotelID;
    }

}

