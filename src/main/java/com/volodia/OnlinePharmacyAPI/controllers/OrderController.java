package com.volodia.OnlinePharmacyAPI.controllers;

import com.volodia.OnlinePharmacyAPI.email.EmailService;
import com.volodia.OnlinePharmacyAPI.entities.Order;
import com.volodia.OnlinePharmacyAPI.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/orders", produces = "application/json")
@CrossOrigin(origins = "*")
public class OrderController {
    private final OrderRepository orderRepository;
    private final EmailService emailService;

    @Autowired
    public OrderController(OrderRepository orderRepository, EmailService emailService) {
        this.orderRepository = orderRepository;
        this.emailService = emailService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order postOrder(@RequestBody Order order){
        order.setId(UUID.randomUUID().toString());
        System.out.println(order.toString());
        emailService.sendEmail(
                order.getEmail(),
                "Order successfully created",
                order.getId());
        return orderRepository.save(order);
    }

}
