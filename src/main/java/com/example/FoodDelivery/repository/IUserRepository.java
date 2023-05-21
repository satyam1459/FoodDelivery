package com.example.FoodDelivery.repository;

import com.example.FoodDelivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String userEmail);

    User findByUserId(Long userId);
}
