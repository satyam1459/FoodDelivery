package com.example.FoodDelivery.repository;

import com.example.FoodDelivery.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepository extends JpaRepository<FoodItem, Long> {
    FoodItem findByFoodItemId(Long foodItemId);
}
