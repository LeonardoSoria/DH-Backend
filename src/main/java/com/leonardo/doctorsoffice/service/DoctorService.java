package com.leonardo.doctorsoffice.service;

import com.leonardo.doctorsoffice.entity.Doctor;
import com.leonardo.doctorsoffice.entity.Patient;
import com.leonardo.doctorsoffice.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor updateDoctor(Doctor doctor) {
        Doctor currentDoctor = doctorRepository.findById(doctor.getId()).orElse(null);
        currentDoctor.setName(doctor.getName());
        currentDoctor.setLastname(doctor.getLastname());
        currentDoctor.setAddress(doctor.getAddress());
        currentDoctor.setBirthdate(doctor.getBirthdate());
        currentDoctor.setPictureUrl(doctor.getPictureUrl());
        currentDoctor.setSpeciality(doctor.getSpeciality());
        return doctorRepository.save(doctor);
    }

    public Doctor deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
        return null;
    }
}
