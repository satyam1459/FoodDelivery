package com.example.FoodDelivery.repository;

import com.example.FoodDelivery.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodOrderRepository extends JpaRepository<FoodOrder,Long> {
    FoodOrder findByFoodOrderId(Long orderId);
}
