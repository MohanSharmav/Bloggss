package com.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DAO.MainpageDao;
import com.api.mainblog;


@Controller
public class MainController 
{
	
	com.DAO.MainDao MainDao=new MainpageDao();
	
	@RequestMapping("/Mainpage")
public String showMain() {
		
	List<mainblog>	mainblog=MainDao.loadMainpage();
		//callDAO
	return "Mainpage";
	
}
	
	@RequestMapping("/hii")
	public String Ji()
	{
		return "ok";
	}
}
