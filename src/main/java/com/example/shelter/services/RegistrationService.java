package com.example.shelter.services;

import com.example.shelter.appuser.AppUser;
import com.example.shelter.appuser.AppUserRole;
import com.example.shelter.registration.RegistrationRequest;
import com.example.shelter.services.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final AppUserService appUserService;


    public String register(RegistrationRequest request) {
        return appUserService.signUpUser(new AppUser(request.getUsername(), request.getPassword(), AppUserRole.USER));
    }
}
