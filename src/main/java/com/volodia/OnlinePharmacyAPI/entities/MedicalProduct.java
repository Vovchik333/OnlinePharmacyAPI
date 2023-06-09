package com.volodia.OnlinePharmacyAPI.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force=true)
@Entity
public class MedicalProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Medication medication;

    private final int quantity;

    private final double sumPrice;

}
