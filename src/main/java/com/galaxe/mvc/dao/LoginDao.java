package com.galaxe.mvc.dao;

import com.galaxe.mvc.model.UserBO;

public interface LoginDao {
	
	public UserBO validateUser(UserBO userBo);

}
