package com.volodia.OnlinePharmacyAPI.repositories;

import com.volodia.OnlinePharmacyAPI.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {

}
