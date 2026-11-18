package com.fooddelivery.controller;

import com.fooddelivery.entity.Food;
import com.fooddelivery.service.FoodService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoodController {
    private final FoodService service;
    public FoodController(FoodService service) { this.service = service; }

    @GetMapping("/foods")
    public String listFoods(Model model) {
        model.addAttribute("foods", service.getAllFoods());
        return "foods";
    }

    @GetMapping("/foods/add")
    public String showAddForm(Model model) {
        model.addAttribute("food", new Food());
        return "add-food";
    }

    @PostMapping("/foods/save")
    public String saveFood(@ModelAttribute Food food) {
        service.saveFood(food);
        return "redirect:/foods";
    }

    @GetMapping("/foods/delete/{id}")
    public String deleteFood(@PathVariable Long id) {
        service.deleteFood(id);
        return "redirect:/foods";
    }
}