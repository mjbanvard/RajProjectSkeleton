package com.galaxe.springMvc.service;

import com.galaxe.springMvc.domain.UserVO;

public interface LoginService {
	
	public UserVO validateUser(UserVO userVo);

}
