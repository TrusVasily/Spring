package netcracker.nchostel.web;

import netcracker.nchostel.domain.Hostel;
import netcracker.nchostel.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller

public class HostelController {
    @Autowired
    private HostelService hostelService;

    @RequestMapping("/Hostel")
    public String listHostel(Map<String, Object> map) {

        map.put("hostel", new Hostel());
        map.put("hostelList", hostelService.listHostel());

        return "hostel";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/Hostel";
    }

    @RequestMapping(value = "/addHostel", method = RequestMethod.POST)
    public String addHostel(@ModelAttribute("hostel") Hostel hostel,
                              BindingResult result) {

        hostelService.addHostel(hostel);

        return "redirect:/Hostel";
    }

    @RequestMapping("/deleteHostel/{hostID}")
    public String deleteHostel(@PathVariable("hostID") Integer hostID) {

        hostelService.removeHostel(hostID);

        return "redirect:/Hostel";
    }

    @RequestMapping(value = "/updateHostel", method = RequestMethod.POST)
    public String updateHostel(@ModelAttribute("hostel") Hostel hostel,
                                 BindingResult result) {

        hostelService.updateHostel(hostel);

        return "redirect:/Hostel";
    }
}
