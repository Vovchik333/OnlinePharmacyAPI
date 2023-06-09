package com.volodia.OnlinePharmacyAPI.repositories;

import com.volodia.OnlinePharmacyAPI.entities.MedicalProduct;
import org.springframework.data.repository.CrudRepository;

public interface MedicalProductRepository extends CrudRepository<MedicalProduct, Long> {
}
