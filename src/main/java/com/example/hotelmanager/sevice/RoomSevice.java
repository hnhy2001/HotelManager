package com.example.hotelmanager.sevice;

import com.example.hotelmanager.dto.ConvertRoomDto;
import com.example.hotelmanager.dto.RoomDto;
import com.example.hotelmanager.model.Room;
import com.example.hotelmanager.repository.RoomRepository;
import com.example.hotelmanager.request.CreateRoomRequest;
import com.example.hotelmanager.request.UpdateRoomRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomSevice {

  @Autowired
  RoomRepository roomRepository;

  ConvertRoomDto convertRoomDto = new ConvertRoomDto();

  public String createRoom(CreateRoomRequest createRoomRequest){
    Room room = Room.builder()
        .idRoom(createRoomRequest.getIdRoom())
        .price(createRoomRequest.getPrice())
        .status(true)
        .isActive(true)
        .build();
    roomRepository.save(room);
    return "Đã tạo thành công phòng!";

  }

  public List<RoomDto> getAllRoom(){
    List<Room> roomList = roomRepository.findAll();
    List<RoomDto> roomDtoList = new ArrayList<>();
    for (int i = 0; i<roomList.size(); i++){
      RoomDto roomDto = convertRoomDto.convertRoomDtoFromRoom(roomList.get(i));
      roomDtoList.add(roomDto);
    }

    return roomDtoList;
  }

  public RoomDto getRoomById(int id){

    Room room = roomRepository.findAllByIdRoom(id);
    RoomDto roomDto = convertRoomDto.convertRoomDtoFromRoom(room);

    return roomDto;
  }

  public String deleteRoomById(int id){
    Room room = roomRepository.findAllByIdRoom(id);
    room.setIsActive(false);
    roomRepository.save(room);
    return "Đã xóa bỏ phòng thành công!";
  }

  public RoomDto updateRoom(UpdateRoomRequest updateRoomRequest, int id){
    Room room = roomRepository.findAllByIdRoom(id);
    if (room == null){
      return new RoomDto();
    }

    if (updateRoomRequest.getPrice() != 0.0){
      room.setPrice(updateRoomRequest.getPrice());
    }
    if (updateRoomRequest.getStatus() != null){
      room.setStatus(updateRoomRequest.getStatus());
    }
    if (updateRoomRequest.getIsActive() != null){
      room.setIsActive(updateRoomRequest.getIsActive());
    }
    if (updateRoomRequest.getTimeIn() != null){
      room.setTimeIn(updateRoomRequest.getTimeIn());
    }
    if (updateRoomRequest.getTimeOut() != null){
      room.setTimeOut(updateRoomRequest.getTimeOut());
    }
    if (updateRoomRequest.getAvatarRoom() != null){
      room.setAvatarRoom(updateRoomRequest.getAvatarRoom());
    }
    roomRepository.save(room);
    return convertRoomDto.convertRoomDtoFromRoom(room);


  }
}
