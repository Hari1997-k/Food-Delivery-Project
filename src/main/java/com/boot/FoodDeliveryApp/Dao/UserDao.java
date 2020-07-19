package com.boot.FoodDeliveryApp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.FoodDeliveryApp.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	@Query(value = "from User where uid = ?1")
	public List<User> View_UserFood(Integer uid);

}
