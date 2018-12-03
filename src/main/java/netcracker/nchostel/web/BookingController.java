package netcracker.nchostel.web;

import netcracker.nchostel.domain.Booking;
import netcracker.nchostel.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @RequestMapping("/Booking")
    public String listBooking(Map<String, Object> map) {

        map.put("booking", new Booking());
        map.put("bookingList", bookingService.listBooking());

        return "booking";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/Booking";
    }

    @RequestMapping(value = "/addBooking", method = RequestMethod.POST)
    public String addBooking(@ModelAttribute("booking") Booking booking) {

        if(booking.getBookingID() == 0) {
            bookingService.addBooking(booking);
        } else {
            bookingService.updateBooking(booking);
        }
        return "redirect:/Booking";
    }

    @RequestMapping("/deleteBooking/{bookingID}")
    public String deleteBooking(@PathVariable("bookingID") Integer bookingID) {

        bookingService.removeBooking(bookingID);

        return "redirect:/Booking";
    }

    @RequestMapping(value = "/updateBooking", method = RequestMethod.POST)
    public String updateBooking(@ModelAttribute("booking") Booking booking,
                                 BindingResult result) {

        bookingService.updateBooking(booking);

        return "redirect:/Booking";
    }
}
