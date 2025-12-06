package com.example.hospitalmanagement.services;

import com.example.hospitalmanagement.models.Doctor;
import com.example.hospitalmanagement.models.Patient;
import com.example.hospitalmanagement.repository.DoctorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Service
public class DoctorService {
    private Patient patient;

    @Autowired
    private DoctorRepository doctorRepository;
    private List<Doctor> getAllDoctors(){
        try{
            return doctorRepository.findAll();
        }catch(Exception e){
            System.out.println("Exception in fetching all doctors: " + e.getMessage());
            return null;

        }

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
