package com.galaxe.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.mvc.dao.LoginDao;
import com.galaxe.mvc.domain.UserVO;
import com.galaxe.mvc.model.UserBO;

@Service("LoginServiceImpl")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public UserVO validateUser(UserVO userVo) {
		
		UserBO userBo =  loginDao.validateUser(userVoToUserBo(userVo));
		userVo = userBoToUserVo(userBo);
		
		return userVo;
	}
	
	private UserBO userVoToUserBo(UserVO userVo) {
		UserBO userBo = new UserBO();
		userBo.setFirstName(userVo.getFirstName());
		userBo.setLastName(userVo.getLastName());
		userBo.setPassword(userVo.getPassword());
		userBo.setUsername(userVo.getUsername());
		userBo.setRole(userVo.getRole());
		userBo.setGender(userVo.getGender());
		
		return userBo;
	}
	
	private UserVO userBoToUserVo(UserBO userBo) {
		UserVO userVo = new UserVO();
		userVo.setFirstName(userBo.getFirstName());
		userVo.setLastName(userBo.getLastName());
		userVo.setPassword(userBo.getPassword());
		userVo.setUsername(userBo.getUsername());
		userVo.setRole(userBo.getRole());
		userVo.setGender(userBo.getGender());
		
		return userVo;
	}

}
