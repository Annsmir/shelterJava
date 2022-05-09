package com.example.shelter.controllers;

import com.example.shelter.registration.RegistrationRequest;
import com.example.shelter.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping("/auth/signin")
    public String register(@RequestPart String username, @RequestPart String password) {
        RegistrationRequest registrationRequest = new RegistrationRequest(username, password);
        return registrationService.register(registrationRequest);
    }
}
