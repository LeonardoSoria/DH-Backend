package com.leonardo.doctorsoffice.repository;

import com.leonardo.doctorsoffice.entity.MedicalConsultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalConsultationRepository extends JpaRepository<MedicalConsultation, Long> {

    List<MedicalConsultation> findAllByDoctor_Id(Long id);
    List<MedicalConsultation> findAllByPatient_Id(Long id);
}
