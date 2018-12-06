package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Booking;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingDAOImpl implements BookingDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBooking(Booking booking) {
        sessionFactory.getCurrentSession().save(booking);
    }


    @SuppressWarnings("unchecked")
    public List<Booking> listBooking() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Booking");
        return query.list();
    }

    public void removeBooking(Integer id) {
        Booking booking = sessionFactory.getCurrentSession().load(Booking.class, id);
        if (null != booking) {
            sessionFactory.getCurrentSession().delete(booking);
        }
    }

    public void updateBooking(Booking booking) {
        Session session = sessionFactory.getCurrentSession();
        Booking eBooking = session.get(Booking.class, booking.getBookingID());
        session.update(eBooking);
    }
}