package com.example.FoodDelivery.controller;

import com.example.FoodDelivery.model.FoodOrder;
import com.example.FoodDelivery.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class FoodOrderController {

    @Autowired
    private FoodOrderService foodOrderService;

    @PostMapping()
    public FoodOrder createOrder(@RequestParam String userEmail,@RequestParam String token,@RequestBody FoodOrder foodOrder){
        return foodOrderService.createOrder(foodOrder);
    }

    @GetMapping("/{orderId}")
    public FoodOrder getOrderById(@PathVariable Long orderId){
        return foodOrderService.getOrderById(orderId);
    }
}
