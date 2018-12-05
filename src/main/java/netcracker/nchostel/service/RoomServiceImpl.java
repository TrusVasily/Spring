package netcracker.nchostel.service;

import netcracker.nchostel.dao.RoomDAO;
import netcracker.nchostel.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    private RoomDAO roomDAO;

    @Transactional
    public void addRoom(Room room) {
        roomDAO.addRoom(room);
    }

    @Transactional
    public List<Room> listRoom() {
        return roomDAO.listRoom();
    }

    @Transactional
    public void removeRoom(Integer id) {
        roomDAO.removeRoom(id);
    }

    @Transactional
    public void updateRoom(Room room) {
        roomDAO.updateRoom(room);
    }
}