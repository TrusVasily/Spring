package netcracker.nchostel.service;

import netcracker.nchostel.domain.RoomType;

import java.util.List;

public interface RoomTypeService {

    public void addRoomType(RoomType roomType);

    public List<RoomType> listRoomType();

    public void removeRoomType(Character id);

    public void updateRoomType(RoomType roomType);
}
