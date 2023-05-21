package com.example.FoodDelivery.service;

import com.example.FoodDelivery.model.FoodItem;
import com.example.FoodDelivery.repository.IFoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    private IFoodItemRepository foodItemRepository;


    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    public FoodItem createFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    public FoodItem getFoodItemById(Long id) {
        return foodItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Food item not found"));
    }

    public void deleteFoodItem(Long id) {
        foodItemRepository.deleteById(id);
    }

    public boolean addFoodItem(FoodItem foodItem) {
       foodItemRepository.save(foodItem);
       return true;
    }
}
