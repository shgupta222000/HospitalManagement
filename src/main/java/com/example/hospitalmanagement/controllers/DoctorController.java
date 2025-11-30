package com.example.hospitalmanagement.controllers;

import com.example.hospitalmanagement.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

     @GetMapping
     public List<Doctor> getAllDoctors() {
            System.out.println("fetching all doctors");
            return null;
     }
     @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        System.out.println("adding a doctor");
        return doctor;
     }
    @GetMapping("/{id}")
    public Doctor getDoctorById(@RequestParam long id) {
        System.out.println("fetching doctor by id: " + id);
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteDoctorById(@RequestParam long id) {
        System.out.println("deleting doctor by id: " + id);
    }
    @PutMapping("/{id}")
    public Doctor updateDoctorById(@RequestParam long id, @RequestBody Doctor doctor){
        System.out.println("updating doctor by id: " + id);
        return doctor;
    }

}
