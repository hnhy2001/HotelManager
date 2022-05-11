package com.example.hotelmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  @Id
  @Column(name = "id_product")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idProduct;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "price", nullable = false)
  private Double price;

  @Column(name = "avatar")
  private String avatar;

  @ManyToMany(mappedBy = "productList")
  private List<Room> roomList;

}
