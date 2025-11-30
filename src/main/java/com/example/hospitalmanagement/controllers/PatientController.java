package com.example.hospitalmanagement.controllers;

import com.example.hospitalmanagement.models.Patient;
import com.example.hospitalmanagement.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping
    public List<Patient>getAllPatients(){
        System.out.println("fetching all patients");
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("creating a patient");
        return patient;
    }
    @GetMapping("/{id}")
    public Patient getPatientById(@RequestParam long id){
        System.out.println("fetching patient by id: " + id);
        return patientService.getPatientById(id);
    }
    @DeleteMapping("/{id}")
    public void deletePatientById(@RequestParam long id){
        System.out.println("deleting patient by id: " + id);
    }
    @PutMapping("/{id}")
    public Patient updatePatientById(@RequestParam long id, @RequestBody Patient patient) {
        System.out.println("updating patient by id: " + id);
        return patient;
    }
}
