package com.galaxe.mvc.dao;

import org.springframework.stereotype.Repository;

import com.galaxe.mvc.model.UserBO;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public UserBO validateUser(UserBO userBo) {
		
		if(userBo.getUsername().equalsIgnoreCase("admin")) {
			userBo.setRole("admin");
		} else {
			userBo.setRole("user");
		}
		
		return userBo;
	}

}
