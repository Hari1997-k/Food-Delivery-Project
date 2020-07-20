package com.boot.FoodDeliveryApp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.FoodDeliveryApp.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	@Query(value = "from User where uid = ?1")
	public List<User> View_UserFood(Integer uid);

	@Transactional
	@Modifying
	@Query(value = "update User set foodItem =?1 where uid =?2")
	public void Save_User_SelectedFood(String Selected_Food, Integer uid);

	@Transactional
	@Modifying
	@Query(value = "update User set foodItem =?1 where uid =?2")
	public void Update_UserFood(String New_FoodItem, Integer uid);

	@Transactional
	@Modifying
	@Query(value = "update User set foodItem = null where uid =?1")
	public void Delete_UserFood(Integer uid);

}
