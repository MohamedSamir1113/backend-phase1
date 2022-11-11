package com.example.trip.JPA;

import com.example.trip.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJPA extends JpaRepository <Admin , Long> {
}
