package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Room;

import java.util.List;

public interface RoomDAO {
    public void addRoom(Room room);

    public List<Room> listRoom();

    public void removeRoom(Integer id);

    public void updateRoom(Room room);
}
