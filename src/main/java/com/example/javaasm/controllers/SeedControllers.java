package com.example.javaasm.controllers;

import com.example.javaasm.entity.Street;
import com.example.javaasm.service.SeedService;
import com.example.javaasm.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/seed")
public class SeedControllers {
    @Autowired
    private SeedService seedService;

    @RequestMapping(method = RequestMethod.POST, value = "/generate")
    public boolean findAllEmployees() {
        return seedService.seed();
    }
}
