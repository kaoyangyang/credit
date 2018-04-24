package com.ly.credit.controller;

import com.ly.credit.service.UserService;
import com.ly.credit.util.AdResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	@Resource
	private HttpServletRequest request;
	@Resource
	private UserService userService;
	@RequestMapping("/register.do")
	//@ResponseBody
	public String index(ModelMap map,
	                    @RequestParam(required = false, value = "name", defaultValue = "") String name,
	                    @RequestParam(required = false, value = "phone", defaultValue = "") String phone,
	                    @RequestParam(required = false, value = "password", defaultValue = "") String password,
	                    @RequestParam(required = false, value = "code", defaultValue = "") Integer code ) throws Exception {
		AdResult register = userService.register(name, phone, password, code);
		return "index/index";


	}


}
