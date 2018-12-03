package netcracker.nchostel.dao;

import netcracker.nchostel.domain.RoomType;

import java.util.List;

public interface RoomTypeDAO {
    public void addRoomType(RoomType roomType);

    public List<RoomType> listRoomType();

    public void removeRoomType(Character id);

    public void updateRoomType(RoomType roomType);
}
