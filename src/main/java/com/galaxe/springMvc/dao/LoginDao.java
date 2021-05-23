package com.galaxe.springMvc.dao;

import com.galaxe.springMvc.model.UserBO;

public interface LoginDao {
	
	public UserBO validateUser(UserBO userBo);

}
