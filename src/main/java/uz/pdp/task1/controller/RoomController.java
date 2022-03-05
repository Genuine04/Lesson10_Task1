package uz.pdp.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.task1.payload.RoomDto;
import uz.pdp.task1.service.RoomService;
import uz.pdp.task1.utills.AppConstants;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/getRoomsByHotelId/{hotel_id}")
    public HttpEntity<?> getRoomsByHotelId(
            @PathVariable Long hotel_id,
            @RequestParam(value = "page",defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) Integer page,
            @RequestParam(value = "size",defaultValue = AppConstants.DEFAULT_PAGE_SIZE) Integer size,
            @RequestParam(value = "all",defaultValue = "true") boolean all
    ){
        return ResponseEntity.ok(roomService.getAllRoomsByHotelId(hotel_id,page,size,all));
    }

    @GetMapping("/delete/{id}")
    public HttpEntity<?> delete(@PathVariable Long id){
        return ResponseEntity.ok(roomService.remove(id));
    }

    @PostMapping("/saveOrEdit")
    public HttpEntity<?> saveOrEdit(@RequestBody RoomDto dto){
        return ResponseEntity.ok(roomService.saveOrEdit(dto));
    }

    @GetMapping("/all")
    public HttpEntity<?> getAllRooms(){
        return ResponseEntity.ok(roomService.getAllRooms());
    }

    @GetMapping("/getRoomById/{id}")
    public HttpEntity<?> getRoomById(@PathVariable Long id){
        return ResponseEntity.ok(roomService.getRoomById(id));
    }

}
