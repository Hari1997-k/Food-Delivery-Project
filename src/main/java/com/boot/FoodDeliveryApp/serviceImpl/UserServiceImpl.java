package com.boot.FoodDeliveryApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.boot.FoodDeliveryApp.Dao.UserDao;
import com.boot.FoodDeliveryApp.model.User;
import com.boot.FoodDeliveryApp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao udao;

	@Override
	@Query(value = "update User set foodItem =?1 where uid =?2")
	public void Save_User_SelectedFood(String Selected_Food, Integer uid) {

	}

	@Override
	@Query(value = "update User set foodItem =?1 where uid =?2")
	public void Update_UserFood(String New_FoodItem, Integer uid) {

	}

	@Override
	public List<User> View_UserFood(Integer uid) {
		List<User> ulist = udao.View_UserFood(uid);
		return ulist;
	}

	@Override
	@Query(value = "update User set foodItem = null where uid =?1")
	public void Delete_UserFood(Integer uid) {

	}

}
