package com.boot.FoodDeliveryApp.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.boot.FoodDeliveryApp.model.User;

public interface UserService {
	
	@Query(value = "update User set foodItem =?1 where uid =?2")
	public void Save_User_SelectedFood(String Selected_Food, Integer uid);
	
	@Query(value = "update User set foodItem =?1 where uid =?2")
	public void Update_UserFood(String New_FoodItem, Integer uid);
	
	@Query(value = "from User where uid = ?1")
	public List<User> View_UserFood(Integer uid);	
	
	@Query(value = "update User set foodItem = null where uid =?1")
	public void Delete_UserFood(Integer uid);
	
	
	
	
	

}
