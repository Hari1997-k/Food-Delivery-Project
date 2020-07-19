package com.boot.FoodDeliveryApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.FoodDeliveryApp.Dao.FoodDao;
import com.boot.FoodDeliveryApp.model.Food;
import com.boot.FoodDeliveryApp.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodDao fdao ;

	@Override
	public List<Food> findAll() {
		List<Food> flist = fdao.findAll();
		return flist;
	}

}
