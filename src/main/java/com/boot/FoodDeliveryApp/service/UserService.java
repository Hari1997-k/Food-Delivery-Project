package com.boot.FoodDeliveryApp.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.boot.FoodDeliveryApp.model.User;

public interface UserService {
	
	public void Save_User_SelectedFood(String Selected_Food, Integer uid);
	
	public void Update_UserFood(String New_FoodItem, Integer uid);
	
	@Query(value = "from User where uid = ?1")
	public List<User> View_UserFood(Integer uid);	
	
	public void Delete_UserFood(Integer uid);
	
	
	
	
	

}
