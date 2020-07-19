package com.boot.FoodDeliveryApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.FoodDeliveryApp.model.Food;

@Repository
public interface FoodDao extends JpaRepository<Food, Integer> {

}
