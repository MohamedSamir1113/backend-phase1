package com.example.trip.JPA;
import com.example.trip.Entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StationJPA extends JpaRepository <Station , Long> {

}
