package com.leonardo.doctorsoffice.controller;

import com.leonardo.doctorsoffice.entity.Patient;
import com.leonardo.doctorsoffice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createPatient")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updatePatient")
    public Patient updatePatient(@RequestBody Patient patient) {
        return patientService.updatePatient(patient);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients() {
        return patientService.getPatients();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getPatient/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deletePatient/{id}")
    public Patient deletePatient(@PathVariable Long id) {
        return patientService.deletePatient(id);
    }
}
