package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Hostel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HostelDAOImpl implements HostelDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addHostel(Hostel hostel) {
        sessionFactory.getCurrentSession().persist(hostel);
    }

    @SuppressWarnings("unchecked")
    public List<Hostel> listHostel() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Hostel");
        return query.list();
    }

    public void removeHostel(Integer id) {
        Hostel hostel = (Hostel) sessionFactory.getCurrentSession().load(Hostel.class, id);
        if (null != hostel) {
            sessionFactory.getCurrentSession().delete(hostel);
        }
    }

    public void updateHostel(Hostel Hostel) {
        Session session = sessionFactory.getCurrentSession();
        Hostel eHostel = session.get(Hostel.class, Hostel.getHostID());
        session.saveOrUpdate(eHostel);
    }
}
