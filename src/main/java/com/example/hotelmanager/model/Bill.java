package com.example.hotelmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "bill")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bill {

  @Id
  @Column(name = "id_bill")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idBill;

  @Column(name = "id_room", nullable = false)
  private Integer idRoom;

  @Column(name = "sum", nullable = false)
  private Double sumPrice;

  @Column(name = "date", nullable = false)
  private Long createTime;
}
