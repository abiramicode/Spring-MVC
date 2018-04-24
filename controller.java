package com.i18n.demoabii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {
@Autowired
abiiservice as;

@RequestMapping("/abii")
	public String display()
	{
		return as.showservice();
	}