package netcracker.nchostel.web;

import netcracker.nchostel.domain.RoomType;
import netcracker.nchostel.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class RoomTypeController {
    @Autowired
    private RoomTypeService roomTypeService;

    @RequestMapping("/RoomType")
    public String listRoom(Map<String, Object> map) {

        map.put("roomType", new RoomType());
        map.put("roomTypeList", roomTypeService.listRoomType());

        return "RoomType";
    }

    @RequestMapping(value = "/addRoomType", method = RequestMethod.POST)
    public String addRoomType(@ModelAttribute("room") RoomType roomType) {

        if (roomType.getRoomType() == " ") {
            roomTypeService.addRoomType(roomType);
        } else {
            roomTypeService.updateRoomType(roomType);
        }
        return "redirect:/RoomType";
    }

    @RequestMapping("/deleteRoomType/{roomType}")
    public String deleteRoomType(@PathVariable("roomType") Character roomType) {

        roomTypeService.removeRoomType(roomType);

        return "redirect:/RoomType";
    }

    @RequestMapping(value = "/updateRoomType", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateRoomType(@ModelAttribute("roomType") RoomType roomType) {

        roomTypeService.updateRoomType(roomType);

        return "redirect:/RoomType";
    }
}
