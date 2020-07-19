package com.boot.FoodDeliveryApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.FoodDeliveryApp.model.User;
import com.boot.FoodDeliveryApp.service.FoodService;
import com.boot.FoodDeliveryApp.service.UserService;

@Controller
public class AppController {

	@Autowired
	FoodService fservice;

	@Autowired
	UserService uservice;

	List<String> userfood = new ArrayList<String>();

	@RequestMapping("/viewmenu")
	public String viewMenu() {
		return "Access The Food Menu ";
	}

	@RequestMapping("/addfood/{id}{fooditem}")
	public String AddFood_To_User(@PathVariable("id") Integer uid, @PathVariable("fooditem") String UserFood) {
		uservice.Save_User_SelectedFood(UserFood, uid);
		return " Food Added ";

	}

	@RequestMapping("/editfood/{id}{newfooditem}")
	public String Update_UserFood(@PathVariable("id") Integer uid, @PathVariable("newfooditem") String newFood) {
		uservice.Update_UserFood(newFood, uid);
		return " User Food Updated ";

	}

	@RequestMapping("/viewuserfood/{id}")
	public String View_UserFood(@PathVariable("id") Integer uid) {
		List<User> ulist = uservice.View_UserFood(uid);
		for (User uu : ulist) {
			userfood.add(uu.getFoodItem());
		}
		return " User Food Viewed ";

	}

	@RequestMapping("/delfood/{id}")
	public String Delete_UserFood(@PathVariable("id") Integer uid) {
		uservice.Delete_UserFood(uid);
		return " Food Deleted ";

	}

}
