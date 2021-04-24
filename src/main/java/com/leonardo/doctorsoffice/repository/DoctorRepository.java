package com.leonardo.doctorsoffice.repository;

import com.leonardo.doctorsoffice.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
