package com.leonardo.doctorsoffice.controller;

import com.leonardo.doctorsoffice.DTO.MedicalConsultationDTO;
import com.leonardo.doctorsoffice.entity.MedicalConsultation;
import com.leonardo.doctorsoffice.entity.Patient;
import com.leonardo.doctorsoffice.service.MedicalConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicalConsultationController {

    @Autowired
    private MedicalConsultationService medicalConsultationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createMedicalConsultation")
    public MedicalConsultation createMedicalConsultation(@RequestBody MedicalConsultationDTO medicalConsultationDTO) {
        return medicalConsultationService.saveMedicalConsultation(medicalConsultationDTO);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateMedicalConsultation")
    public MedicalConsultation updateMedicalConsultation(@RequestBody MedicalConsultation medicalConsultation) {
        return medicalConsultationService.updateMedicalConsultation(medicalConsultation);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAllMedicalConsultations")
    public List<MedicalConsultation> getAllMedicalConsultations() {
        return medicalConsultationService.getMedicalConsultations();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getMedicalConsultation/{id}")
    public MedicalConsultation getPatientById(@PathVariable Long id) {
        return medicalConsultationService.getMedicalConsultationById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getMedicalConsultationByDoctorId/{id}")
    public List<MedicalConsultation> getMedicalConsultationByDoctorId(@PathVariable Long id) {
        return medicalConsultationService.getMedicalConsultationByDoctorId(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getMedicalConsultationByPatientId/{id}")
    public List<MedicalConsultation> getMedicalConsultationByPatientId(@PathVariable Long id) {
        return medicalConsultationService.getMedicalConsultationByPatientId(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteMedicalConsultation/{id}")
    public MedicalConsultation deleteMedicalConsultation(@PathVariable Long id) {
        return medicalConsultationService.deleteMedicalConsultation(id);
    }
}
