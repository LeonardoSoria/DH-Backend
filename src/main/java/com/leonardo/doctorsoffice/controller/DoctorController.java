package com.leonardo.doctorsoffice.controller;

import com.leonardo.doctorsoffice.entity.Doctor;
import com.leonardo.doctorsoffice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/createDoctor")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateDoctor")
    public Doctor updateDoctor(@RequestBody Doctor doctor) {
        return doctorService.updateDoctor(doctor);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getDoctors();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getDoctor/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteDoctor/{id}")
    public Doctor deleteDoctor(@PathVariable Long id) {
        return doctorService.deleteDoctor(id);
    }
}
