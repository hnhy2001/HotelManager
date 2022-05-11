package com.example.hotelmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {

  @Id
  @Column(name = "id_room", nullable = false)
  private Integer idRoom;

  @Column(name = "price", nullable = false)
  private Double price;

  @Column(name = "user_using")
  private Integer userUsing;

  @Column(name = "avg_ssessment", nullable = false)
  private double avgAssessment = 0.0;

  @Column(name = "status")
  private Boolean status = true;

  @Column(name = "is_active")
  private Boolean isActive;

  @Column(name = "timein")
  private Long timeIn;

  @Column(name = "timeout")
  private Long timeOut;

  @Column(name = "avatar_room")
  private String avatarRoom;


  @ManyToMany
  @JoinTable(name = "product_room", joinColumns = @JoinColumn(name = "id_room"), inverseJoinColumns = @JoinColumn(name = "id_product"))
  private List<Product> productList;

  @ManyToOne
  @JoinColumn(name = "id_user")
  private User user;

}
