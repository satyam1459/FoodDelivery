package com.example.FoodDelivery.service;

import com.example.FoodDelivery.model.FoodItem;
import com.example.FoodDelivery.model.FoodOrder;
import com.example.FoodDelivery.model.User;
import com.example.FoodDelivery.repository.IFoodItemRepository;
import com.example.FoodDelivery.repository.IFoodOrderRepository;
import com.example.FoodDelivery.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderService {
    @Autowired
    IFoodOrderRepository iFoodOrderRepository;

    @Autowired
    IUserRepository iUserRepository;

    @Autowired
    IFoodItemRepository foodItemRepository;

    public FoodOrder createOrder(FoodOrder foodOrder) {

        User user = iUserRepository.findByUserId(foodOrder.getUser().getUserId());
        foodOrder.setUser(user);
        FoodItem foodItem = foodItemRepository.findByFoodItemId(foodOrder.getFoodItem().getFoodItemId());
        foodOrder.setFoodItem(foodItem);

        return iFoodOrderRepository.save(foodOrder);
    }

    public FoodOrder getOrderById(Long orderId) {
        return iFoodOrderRepository.findByFoodOrderId(orderId);
    }

    public List<FoodOrder> getAllOrders() {
        return iFoodOrderRepository.findAll();
    }
}
