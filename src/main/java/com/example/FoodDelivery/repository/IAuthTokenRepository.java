package com.example.FoodDelivery.repository;

import com.example.FoodDelivery.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepository extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findFirstByToken(String token);
}
