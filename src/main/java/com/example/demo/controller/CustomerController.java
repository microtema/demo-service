package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public List<Map<String, UUID>> list() {

        return List.of(Map.of("id", UUID.randomUUID()));
    }
}
