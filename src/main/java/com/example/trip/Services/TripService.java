package com.example.trip.Services;
import com.example.trip.Entities.Trip;
import com.example.trip.JPA.TripJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    TripJPA tripJPA;
    Trip tr;
    public void createTrip(Trip t){
        tripJPA.save(t);
    }

    public Trip getTrip(long id){return tripJPA.findById(id).get();}

    public List<Trip> getAllTrips(){
        return tripJPA.findAll();
    }

    public void deleteTrip(Long id){
        tripJPA.deleteById(id);
    }

    public Trip updateTrip(Trip body, Long id){

        Trip trip= tripJPA.findById(id).get();
        trip.setFromStation(body.getFromStation());
        trip.setToStation(body.getToStation());
        trip.setStartTime(body.getStartTime());
        trip.setEndTime(body.getEndTime());
        return tripJPA.save(trip);
    }


}
