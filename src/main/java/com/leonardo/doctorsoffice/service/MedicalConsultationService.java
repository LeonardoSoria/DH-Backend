package com.leonardo.doctorsoffice.service;

import com.leonardo.doctorsoffice.DTO.MedicalConsultationDTO;
import com.leonardo.doctorsoffice.entity.MedicalConsultation;
import com.leonardo.doctorsoffice.entity.Patient;
import com.leonardo.doctorsoffice.repository.DoctorRepository;
import com.leonardo.doctorsoffice.repository.MedicalConsultationRepository;
import com.leonardo.doctorsoffice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalConsultationService {

    @Autowired
    private MedicalConsultationRepository medicalConsultationRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    public MedicalConsultation saveMedicalConsultation(MedicalConsultationDTO medicalConsultationDTO) {
        MedicalConsultation medicalConsultation = new MedicalConsultation();
        medicalConsultation.setDescription(medicalConsultationDTO.getDescription());
        medicalConsultation.setPrescription(medicalConsultationDTO.getPrescription());
        medicalConsultation.setDate(medicalConsultationDTO.getDate());
        medicalConsultation.setPatient(patientRepository.findById(medicalConsultationDTO.getPatientId()).orElse(null));
        medicalConsultation.setDoctor(doctorRepository.findById(medicalConsultationDTO.getDoctorId()).orElse(null));
        return medicalConsultationRepository.save(medicalConsultation);
    }

    public List<MedicalConsultation> getMedicalConsultations() {
        return medicalConsultationRepository.findAll();
    }

    public MedicalConsultation getMedicalConsultationById(Long id) {
        return medicalConsultationRepository.findById(id).get();
    }

    public List<MedicalConsultation> getMedicalConsultationByDoctorId(Long id) {
        return medicalConsultationRepository.findAllByDoctor_Id(id);
    }

    public List<MedicalConsultation> getMedicalConsultationByPatientId(Long id) {
        return medicalConsultationRepository.findAllByPatient_Id(id);
    }

    public MedicalConsultation updateMedicalConsultation(MedicalConsultation medicalConsultation) {
        MedicalConsultation currentMedicalConsultation = medicalConsultationRepository.
                findById(medicalConsultation.getId()).orElse(null);
        currentMedicalConsultation.setDescription(medicalConsultation.getDescription());
        currentMedicalConsultation.setPrescription(medicalConsultation.getPrescription());
        return medicalConsultationRepository.save(currentMedicalConsultation);
    }

    public MedicalConsultation deleteMedicalConsultation(Long id) {
        medicalConsultationRepository.deleteById(id);
        return null;
    }
}
