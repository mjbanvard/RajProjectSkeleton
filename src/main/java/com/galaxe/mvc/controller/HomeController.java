package com.galaxe.mvc.controller;

//import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.slf4j.LoggerFactory;

import com.galaxe.mvc.domain.UserVO;

@Controller
@RequestMapping(value="/register")
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
		
		return mav;
	}
	
	

}
