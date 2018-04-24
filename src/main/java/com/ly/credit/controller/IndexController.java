package com.ly.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
	@Resource
	private HttpServletRequest request;
	@RequestMapping("/index.do")
	//@ResponseBody
	public String index(ModelMap map){
		HttpSession session = request.getSession();
		//String acount=req.getParameter("acount");
		//获取session中作为判断的字段

			return "index/index";


	}


}
