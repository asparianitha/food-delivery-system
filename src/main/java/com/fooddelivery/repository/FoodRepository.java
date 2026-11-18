package com.fooddelivery.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
