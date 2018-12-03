package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Booking;

import java.util.List;

public interface BookingDAO {

        public void addBooking(Booking booking);

        public List<Booking> listBooking();

        public void removeBooking(Integer id);

        public void updateBooking(Booking booking);
}
