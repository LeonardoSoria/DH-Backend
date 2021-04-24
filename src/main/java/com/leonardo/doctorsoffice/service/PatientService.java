package com.leonardo.doctorsoffice.service;

import com.leonardo.doctorsoffice.entity.Patient;
import com.leonardo.doctorsoffice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient updatePatient(Patient patient) {
        Patient currentPatient = patientRepository.findById(patient.getId()).orElse(null);
        currentPatient.setName(patient.getName());
        currentPatient.setLastname(patient.getLastname());
        currentPatient.setAddress(patient.getAddress());
        currentPatient.setBirthdate(patient.getBirthdate());
        currentPatient.setPictureUrl(patient.getPictureUrl());
        return patientRepository.save(currentPatient);
    }

    public Patient deletePatient(Long id) {
        patientRepository.deleteById(id);
        return null;
    }

}
