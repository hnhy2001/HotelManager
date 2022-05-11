package com.example.hotelmanager.dto;

import com.example.hotelmanager.model.Room;

public class ConvertRoomDto {

  public RoomDto convertRoomDtoFromRoom(Room room){
    RoomDto roomDto = RoomDto.builder()
        .idRoom(room.getIdRoom())
        .price(room.getPrice())
        .userUsing(room.getUserUsing())
        .avgAssessment(room.getAvgAssessment())
        .status(room.getStatus())
        .isActive(room.getIsActive())
        .timeIn(room.getTimeIn())
        .timeOut(room.getTimeOut())
        .avatarRoom(room.getAvatarRoom())
        .productList(room.getProductList())
        .user(room.getUser())
        .build();
    return roomDto;
  }
}
