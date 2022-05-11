package com.example.hotelmanager.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateRoomRequest {

  private Integer idRoom;
  private double price;

}
