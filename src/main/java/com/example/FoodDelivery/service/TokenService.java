package com.example.FoodDelivery.service;

import com.example.FoodDelivery.model.AuthenticationToken;
import com.example.FoodDelivery.repository.IAuthTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
    @Autowired
    IAuthTokenRepository tokenRepo;

    public void saveToken(AuthenticationToken token) {
        tokenRepo.save(token);
    }

    public boolean authenticate(String email, String token) {
        if(token==null || email==null){
            return false;
        }

        AuthenticationToken authToken = tokenRepo.findFirstByToken(token);

        if(authToken==null){
            return false;
        }

        String expectedEmail = authToken.getUser().getUserEmail();

        return expectedEmail.equals(email);
    }
}
