package com.example.hotelmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

  @Id
  @Column(name = "id_comment")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idComment;

  @Column(name = "id_user", nullable = false)
  private Integer idUser;

  @Column(name = "content")
  private String content;

}
