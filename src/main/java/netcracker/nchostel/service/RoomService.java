package netcracker.nchostel.service;

import netcracker.nchostel.domain.Room;

import java.util.List;

public interface RoomService {

    public void addRoom(Room room);

    public List<Room> listRoom();

    public void removeRoom(Integer id);

    public void updateRoom(Room room);
}
