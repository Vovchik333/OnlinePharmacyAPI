package com.volodia.OnlinePharmacyAPI.repositories;

import com.volodia.OnlinePharmacyAPI.entities.Medication;
import org.springframework.data.repository.CrudRepository;

public interface MedicationRepository extends CrudRepository<Medication, String> {

}
