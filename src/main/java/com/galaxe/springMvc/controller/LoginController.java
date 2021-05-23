package com.galaxe.springMvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.galaxe.springMvc.domain.UserVO;
import com.galaxe.springMvc.service.LoginService;

@Controller
@RequestMapping({"/user/*", "/"})
public class LoginController {
	
	@Autowired
	@Qualifier("LoginServiceImpl")
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView doLogin(ModelAndView mav, HttpServletRequest req, @ModelAttribute UserVO userVo) {
		
		mav.setViewName("login");
		userVo = loginService.validateUser(userVo);
		if(userVo.getRole().equalsIgnoreCase("admin")) {
			mav.setViewName("login");
		} else {
			mav.setViewName("user");
		}
		
		return mav;
	}
	
	@RequestMapping(value="/backToLogin", method=RequestMethod.GET)
	public ModelAndView doLogin(ModelAndView mav) {
		
		mav.addObject("userVo", new UserVO());
		mav.setViewName("home");
		
		return mav;
	}
	
	
}
