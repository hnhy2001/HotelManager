package com.example.hotelmanager.controller;

import com.example.hotelmanager.dto.RoomDto;
import com.example.hotelmanager.request.CreateRoomRequest;
import com.example.hotelmanager.request.UpdateRoomRequest;
import com.example.hotelmanager.sevice.RoomSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RequestMapping("/room")
@Controller
public class RoomController {

  @Autowired
  RoomSevice roomSevice;

  private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

  @PostMapping("/create")
  @CrossOrigin
  public ResponseEntity<String> createRoom(@RequestBody CreateRoomRequest createRoomRequest){
    return new ResponseEntity<>(roomSevice.createRoom(createRoomRequest), HttpStatus.OK);
  }

  @GetMapping("/getAll")
  @CrossOrigin
  public ResponseEntity<List<RoomDto>> getAll(){
    return new ResponseEntity<>(roomSevice.getAllRoom(), HttpStatus.OK);
  }

  @GetMapping("/getbyid")
  @CrossOrigin
  public ResponseEntity<RoomDto> getByID(@RequestParam(name = "id") int id){
    return new ResponseEntity<>(roomSevice.getRoomById(id), HttpStatus.OK);
  }

  @GetMapping("/delete")
  @CrossOrigin
  public ResponseEntity<String> deleteRoom(@RequestParam(name = "id") int id){
    return new ResponseEntity<>(roomSevice.deleteRoomById(id), HttpStatus.OK);
  }

  @PatchMapping("/update")
  @CrossOrigin
  public ResponseEntity<RoomDto> getByID(@RequestParam(name = "id") int id, @RequestBody UpdateRoomRequest updateRoomRequest){
    return new ResponseEntity<>(roomSevice.updateRoom(updateRoomRequest, id), HttpStatus.OK);
  }
}
