package com.example.hotelmanager.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "notification")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

  @Id
  @Column(name = "id_noti")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idNotification;

  @Column(name = "content_noti", nullable = false)
  private String contentNotification;

  @ManyToOne
  @JoinColumn(name = "id_user")
  private User user;
}
