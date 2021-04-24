package com.leonardo.doctorsoffice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "speciality", nullable = false)
    private String speciality;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @Column(name = "address")
    private String address;

    @Column(name = "picture_url")
    private String pictureUrl;
}
