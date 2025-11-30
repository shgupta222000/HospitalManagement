package com.example.hospitalmanagement.services;

import com.example.hospitalmanagement.models.Doctor;
import com.example.hospitalmanagement.models.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DoctorService {
    private Patient patient;
    private Doctor getAllDoctors(){
        System.out.println("Into Service: fetching all doctors");
        return null;
    }
    private Doctor getDoctorById( long id){
        System.out.println("Into Service: fetching doctor by id: " + id);
        return null;
    }
    private void deleteDoctorById( long id){
        System.out.println("Into Service: deleting doctor by id: " + id);
        return;
    }
    private Doctor updateDoctorById( long id, Doctor doctor) {
        System.out.println("Into Service: updating doctor by id: " + id);
        return doctor;
    }
    private Doctor addDoctor( Doctor doctor) {
        System.out.println("Into Service: adding a doctor");
        return doctor;
    }
}
