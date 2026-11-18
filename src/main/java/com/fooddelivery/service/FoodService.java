package com.fooddelivery.service;


import com.fooddelivery.entity.Food;

import com.fooddelivery.repository.FoodRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService {
    private final FoodRepository repo;
    public FoodService(FoodRepository repo) { this.repo = repo; }

    public List<Food> getAllFoods() { return repo.findAll(); }
    public Food saveFood(Food food) { return repo.save(food); }
    public void deleteFood(Long id) { repo.deleteById(id); }
}
