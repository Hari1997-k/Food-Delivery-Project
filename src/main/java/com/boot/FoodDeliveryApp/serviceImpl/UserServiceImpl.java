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
	public void Save_User_SelectedFood(String Selected_Food, Integer uid) {
		udao.Save_User_SelectedFood(Selected_Food, uid);

	}

	@Override
	public void Update_UserFood(String New_FoodItem, Integer uid) {
		udao.Update_UserFood(New_FoodItem, uid);

	}

	@Override
	public List<User> View_UserFood(Integer uid) {
		List<User> ulist = udao.View_UserFood(uid);
		return ulist;
	}

	@Override
	public void Delete_UserFood(Integer uid) {
		udao.Delete_UserFood(uid);

	}

}
