package com.volodia.OnlinePharmacyAPI.controllers;

import com.volodia.OnlinePharmacyAPI.entities.Medication;
import com.volodia.OnlinePharmacyAPI.repositories.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/medications", produces = "application/json")
public class AllMedicationsController {
    private MedicationRepository medicationRepository;

    @Autowired
    public AllMedicationsController(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    @GetMapping
    public ResponseEntity<Iterable<Medication>> getAllMedications() {
        return new ResponseEntity<>(medicationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medication> getMedication(@PathVariable("id") String id){
        Optional<Medication> medication = medicationRepository.findById(id);
        return medication.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}
