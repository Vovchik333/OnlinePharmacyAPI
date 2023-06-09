package com.volodia.OnlinePharmacyAPI.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force=true)
@Entity
public class Medication {

    @Id
    private final String id;

    private final String name;

    private final String specialization;

    private final String description;

    private final String composition;

    private final String manufacturer;

    private final double price;
}
