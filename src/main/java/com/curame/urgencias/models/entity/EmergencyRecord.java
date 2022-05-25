package com.curame.urgencias.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmergencyRecord {

    private Long id;
    private Boolean allergies;
    private String allergiesDescription;
    private String nss;
    private String insuranceCode;
    private String insuranceCompany;
    private String diagnosticReview;
    private Pacient pacient;
}
