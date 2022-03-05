package uz.pdp.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.task1.entity.Hotel;
import uz.pdp.task1.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/delete/{id}")
    public HttpEntity<?> deleteHotel(@PathVariable Long id){
        return ResponseEntity.ok(hotelService.remove(id));
    }

    @PostMapping("/saveOrEdit")
    public HttpEntity<?> saveOrEdit(@RequestBody Hotel hotel){
        return ResponseEntity.ok(hotelService.saveOrDelete(hotel));
    }

    @GetMapping("/getHotelById/{id}")
    public HttpEntity<?> getHotelById(@PathVariable Long id){
        return ResponseEntity.ok(hotelService.getHotelByID(id));
    }

    @GetMapping("/all")
    public HttpEntity<?> getAllHotel(){
        return ResponseEntity.ok(hotelService.getAll());
    }
}
