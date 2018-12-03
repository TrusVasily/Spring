package netcracker.nchostel.service;

import netcracker.nchostel.domain.Booking;

import java.util.List;

public interface BookingService {
    public void addBooking(Booking booking);

    public List<Booking> listBooking();

    public void removeBooking(Integer id);

    public void updateBooking(Booking booking);
}
