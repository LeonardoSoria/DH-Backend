package com.leonardo.doctorsoffice.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalConsultationDTO {

    private Long id;

    private String description;
    private LocalDate date;
    private String prescription;
    private Long patientId;
    private Long doctorId;
}
