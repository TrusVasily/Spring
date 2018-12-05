package netcracker.nchostel.service;

import netcracker.nchostel.dao.RoomTypeDAO;
import netcracker.nchostel.domain.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeDAO roomTypeDAO;

    @Transactional
    public void addRoomType(RoomType roomType) {
        roomTypeDAO.addRoomType(roomType);
    }

    @Transactional
    public List<RoomType> listRoomType() {
        return roomTypeDAO.listRoomType();
    }

    @Transactional
    public void removeRoomType(Character id) {
        roomTypeDAO.removeRoomType(id);
    }

    @Transactional
    public void updateRoomType(RoomType roomType) {
        roomTypeDAO.updateRoomType(roomType);
    }
}
