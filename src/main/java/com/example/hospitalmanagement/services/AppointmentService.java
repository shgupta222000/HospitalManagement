package com.example.hospitalmanagement.services;

import com.example.hospitalmanagement.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments() {
        System.out.println("Into Service: fetching all appointments");
        return null;
    }
    public Appointment createAppointment(Appointment appointment) {
        System.out.println("Into Service: creating an appointment");
        return appointment;
    }
    public Appointment getAppointmentById(long id) {
        System.out.println("Into Service: fetching appointment by id: " + id);
        return null;
    }
    public void deleteAppointmentById(long id) {
        System.out.println("Into Service: deleting appointment by id: " + id);
    }

}
