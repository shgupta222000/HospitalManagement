package com.example.hospitalmanagement.services;

import com.example.hospitalmanagement.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {

    private static final Logger log = LoggerFactory.getLogger(PatientService.class);
    public List<Patient> getAllPatients(){
        try {
            System.out.println("Into Service: fetching all patients");

            return null;
        }catch (Exception e){
            System.out.println("Exception in fetching all patients: " + e.getMessage());
            log.error("Error fetching all patients", e);
            return null;
        }
    }
    public Patient createPatient(Patient patient){
        System.out.println("Into Service: creating a patient");
        return patient;
    }
    public Patient getPatientById(long id){
        System.out.println("Into Service: fetching patient by id: " + id);
        return null;
    }
    public void deletePatientById(long id){
        System.out.println("Into Service: deleting patient by id: " + id);
        return;
    }
    public Patient updatePatientById(long id, Patient patient){
        System.out.println("Into Service: updating patient by id: " + id);
        return patient;
    }
}
