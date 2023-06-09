package com.volodia.OnlinePharmacyAPI.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force=true)
@Entity
@Table(name = "med_order")
public class Order {

    @Id
    private String id;

    private LocalDateTime placedAt;

    @ManyToMany(targetEntity=MedicalProduct.class, cascade = {CascadeType.ALL})
    private List<MedicalProduct> medicalProducts = new ArrayList<>();;

    private final String name;

    private final String surname;

    private final String email;

    private final String state;

    private final String city;

    private final String address;

    private final String cardNumber;

    private final double totalPrice;

    @PrePersist
    void placedAt() {
        this.placedAt = LocalDateTime.now();
    }
}
