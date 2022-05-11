package com.example.hotelmanager.request;

import com.example.hotelmanager.model.Product;
import com.example.hotelmanager.model.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateRoomRequest {

  private Double price;
  private Boolean status;
  private Boolean isActive;
  private Long timeIn;
  private Long timeOut;
  private String avatarRoom;

}
