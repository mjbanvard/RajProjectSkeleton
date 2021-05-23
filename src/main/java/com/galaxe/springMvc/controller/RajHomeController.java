package com.galaxe.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.galaxe.springMvc.domain.UserVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping(value="/register/*")
public class RajHomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(RajHomeController.class);
	
	@RequestMapping(value ="/home", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mav) {
		UserVO userVo = new UserVO();
		userVo.setFirstName("Henry");
		userVo.setLastName("Blinken");
		userVo.setUsername("Admin");
		userVo.setPassword("DFDFDF");
		userVo.setRole("user");
		userVo.setGender("Male");
		mav.setViewName("home");
		mav.addObject("userVo", userVo);
		System.out.println(logger.toString());
		
		return mav;
	}
	
	

}
