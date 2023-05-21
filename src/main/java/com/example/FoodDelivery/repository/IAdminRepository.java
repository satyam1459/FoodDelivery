package com.example.FoodDelivery.repository;

import com.example.FoodDelivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepository extends JpaRepository<User, Long> {
}
