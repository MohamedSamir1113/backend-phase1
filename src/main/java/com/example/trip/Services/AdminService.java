package com.example.trip.Services;
import com.example.trip.Entities.Admin;
import com.example.trip.Entities.Station;
import com.example.trip.Entities.Trip;
import com.example.trip.JPA.AdminJPA;
import com.example.trip.JPA.StationJPA;
import com.example.trip.JPA.TripJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminJPA adminJPA;
    @Autowired
    TripService tr;
    @Autowired
    StationService st;
    public void signup(Admin a){
        adminJPA.save(a);
    }

    public Admin getAdmin(long id){return adminJPA.findById(id).get();}

    public Admin login(Admin a)
    {
        for(int i=0 ; i<getAllAdmins().size(); i++)
        {
            if(a.getPassword().equals(getAllAdmins().get(i).getPassword()) && a.getUsername().equals(getAllAdmins().get(i).getUsername())) {
                System.out.println("already exist");
                return getAllAdmins().get(i);
            }
        }
        return null;
    }

    public List<Admin> getAllAdmins(){

        return adminJPA.findAll();
    }

    public void createTrip(Trip t){
        tr.createTrip(t);
    }

    public void deleteTrip(Long id){
        tr.deleteTrip(id);
    }

    //public void updateTrip(lon)

    public List<Trip> showAlltrips()
    {
        return tr.getAllTrips();
    }

    public List<Station> showAllstations()
    {
        return st.getAllStations();
    }

    public Trip updateTrip(Trip body, Long id){ return tr.updateTrip(body, id);}


}
