package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Room;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomDAOImpl implements RoomDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addRoom(Room room) {
        sessionFactory.getCurrentSession().save(room);
    }

    @SuppressWarnings("unchecked")
    public List<Room> listRoom() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Room");
        return query.list();
    }

    public void removeRoom(Integer id) {
        Room room = (Room) sessionFactory.getCurrentSession().load(Room.class, id);
        if (null != room) {
            sessionFactory.getCurrentSession().delete(room);
        }
    }

    public void updateRoom(Room Room) {
        Session session = sessionFactory.getCurrentSession();
        Room eRoom = session.get(Room.class, Room.getRoomID());
        session.update(eRoom);
    }
}
