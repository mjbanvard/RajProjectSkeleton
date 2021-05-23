package com.galaxe.springMvc.controller;

import com.galaxe.springMvc.domain.UserVO;
import com.galaxe.springMvc.model.UserBO;

public class MapperUtil {
	public static UserBO userVoToUserBo(UserVO user) {
		UserBO userBo = new UserBO();
		userBo.setFirstName(user.getFirstName());
		userBo.setLastName(user.getLastName());
		userBo.setUsername(user.getUsername());
		userBo.setRole(user.getRole());
		userBo.setEmail(user.getEmail());
		
		return userBo;
	}
	
	public static UserVO userBoToUserVo(UserBO user) {
		UserVO userVo = new UserVO();
		userVo.setFirstName(user.getFirstName());
		userVo.setLastName(user.getLastName());
		userVo.setUsername(user.getUsername());
		userVo.setRole(user.getRole());
		userVo.setEmail(user.getEmail());
		
		return userVo;
	}

}
