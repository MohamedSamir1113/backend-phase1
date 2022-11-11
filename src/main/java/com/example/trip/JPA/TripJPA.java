package com.example.trip.JPA;

import com.example.trip.Entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripJPA extends JpaRepository <Trip , Long> {
}
