package com.example.hotelmanager.repository;

import com.example.hotelmanager.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {

  public List<Room> findAll();

  public Room findAllByIdRoom(int id);
}
