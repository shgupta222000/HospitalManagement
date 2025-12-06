package com.example.hospitalmanagement.services;

import com.example.hospitalmanagement.models.Patient;
import com.example.hospitalmanagement.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger log = LoggerFactory.getLogger(PatientService.class);
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        try {
            System.out.println("Into Service: fetching all patients");

            return patientRepository.findAll();
        }catch (Exception e){
            System.out.println("Exception in fetching all patients: " + e.getMessage());
            log.error("Error fetching all patients", e);
            return null;
        }
    }
    public Patient createPatient(Patient patient){
        try{
            patientRepository.save(patient);
            return  patient;
        } catch (Exception e) {
            log.error("Error creating a patient: " + e.getMessage());
            System.out.println("Into Service: creating a patient");
            return null;
        }

    }
    public Patient getPatientById(long id){
        try{
            Optional<Patient> patientOpt = patientRepository.findById(id);
            if(patientOpt.isPresent()){
                System.out.println("Patient found with id: " + id);
                return patientOpt.get();
            }else{
                System.out.println("No patient found with id: " + id);
                return null;
            }
        }catch (Exception e){
            System.out.println("Exception in fetching patient by id: " + e.getMessage());
            log.error("Error fetching patient by id: " + id, e);
            return null;
        }
    }
    public void deletePatientById(long id){
        System.out.println("Into Service: deleting patient by id: " + id);
        return;
    }
    public Patient updatePatientById(long id, Patient patient){
        try{
            Optional<Patient> patientOpt = patientRepository.findById(id);
            if(patientOpt.isPresent()){
                Patient existingPatient = patientOpt.get();
                existingPatient.setName(patient.getName());
                existingPatient.setAge(patient.getAge());
                patientRepository.save(existingPatient);
                System.out.println("Patient updated with id: " + id);
                return existingPatient;
        }else{
                System.out.println("No patient found with id: " + id);
                return null;
            }
        }catch (Exception e){
            System.out.println("Exception in updating patient by id: " + e.getMessage());
            log.error("Error updating patient by id: " + id, e);
            return null;
        }
    }
}
