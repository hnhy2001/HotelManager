package com.example.hotelmanager.dto;

import com.example.hotelmanager.model.Product;
import com.example.hotelmanager.model.User;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomDto {
  private Integer idRoom;
  private Double price;
  private Integer userUsing;
  private double avgAssessment = 0.0;
  private Boolean status;
  private Boolean isActive;
  private Long timeIn;
  private Long timeOut;
  private String avatarRoom;
  private List<Product> productList;
  private User user;
}
