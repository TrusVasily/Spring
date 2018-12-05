package netcracker.nchostel.service;

import netcracker.nchostel.dao.BookingDAO;
import netcracker.nchostel.domain.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDAO bookingDAO;

    @Transactional
    public void addBooking(Booking booking) {
        bookingDAO.addBooking(booking);
    }

    @Transactional
    public List<Booking> listBooking() {

        return bookingDAO.listBooking();
    }

    @Transactional
    public void removeBooking(Integer id) {
        bookingDAO.removeBooking(id);
    }

    public void updateBooking(Booking booking) {
        bookingDAO.updateBooking(booking);
    }
}
