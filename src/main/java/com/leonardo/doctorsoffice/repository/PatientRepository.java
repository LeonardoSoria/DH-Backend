package com.leonardo.doctorsoffice.repository;

import com.leonardo.doctorsoffice.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
