package com.example.hospitalmanagement.controllers;

import com.example.hospitalmanagement.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("fetching all appointments");
        return null;
    }
    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("creating an appointment");
        return appointment;
    }
    @GetMapping("/{id}")
    public Appointment getAppointmentById(@RequestParam long id) {
        System.out.println("fetching appointment by id: " + id);
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteAppointmentById(@RequestParam long id) {
        System.out.println("deleting appointment by id: " + id);
    }
}
