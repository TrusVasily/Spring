package netcracker.nchostel.dao;

import netcracker.nchostel.domain.RoomType;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomTypeDAOImpl implements RoomTypeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addRoomType(RoomType roomType) {
        sessionFactory.getCurrentSession().save(roomType);
    }

    @SuppressWarnings("unchecked")
    public List<RoomType> listRoomType() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM RoomType");
        return query.list();
    }

    public void removeRoomType(Character id) {
        RoomType roomType = (RoomType) sessionFactory.getCurrentSession().load(RoomType.class, id);
        if (null != roomType) {
            sessionFactory.getCurrentSession().delete(roomType);
        }
    }

    public void updateRoomType(RoomType roomType) {
        Session session = sessionFactory.getCurrentSession();

        RoomType eRoomType = (RoomType) session.get(RoomType.class, roomType.getRoomType());

        session.update(eRoomType);
    }
}
