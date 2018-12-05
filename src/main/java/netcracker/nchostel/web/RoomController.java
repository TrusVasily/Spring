package netcracker.nchostel.web;

import netcracker.nchostel.domain.Room;
import netcracker.nchostel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping("/Room")
    public String listRoom(Map<String, Object> map) {

        map.put("room", new Room());
        map.put("roomList", roomService.listRoom());

        return "room";
    }

    @RequestMapping(value = "/addRoom", method = RequestMethod.POST)
    public String addRoom(@ModelAttribute("room") Room room,
                            BindingResult result) {

        roomService.addRoom(room);

        return "redirect:/Room";
    }

    @RequestMapping("/deleteRoom/{roomID}")
    public String deleteRoom(@PathVariable("roomID") Integer roomID) {

        roomService.removeRoom(roomID);

        return "redirect:/Room";
    }

    @RequestMapping(value = "/updateRoom", method = RequestMethod.POST)
    public String updateRoom(@ModelAttribute("room") Room room,
                               BindingResult result) {

        roomService.updateRoom(room);

        return "redirect:/Room";
    }
}
