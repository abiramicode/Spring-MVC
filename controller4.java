package com.i18n.firstdemo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller4
 {
      @Autowired
	abiservice as;
	@RequestMapping("/hello")
	
	public List<student> getdata()
	   {   
	   return as.getservice();
	   }
  }
