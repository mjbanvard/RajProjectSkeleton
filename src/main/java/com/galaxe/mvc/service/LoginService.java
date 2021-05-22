package com.galaxe.mvc.service;

import com.galaxe.mvc.domain.UserVO;

public interface LoginService {
	
	public UserVO validateUser(UserVO userVo);

}
