package com.example.Springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

@Autowired
JdbcTemplate jdbc;
	
/*@RequestMapping("/create")
	public String display()
	{
		//jdbc.execute("insert into user values(1,'Abirami','k.abiramiabi1996@gmail.com')");
	
		jdbc.execute("insert into user values(2,'Balu','balu@gmail.com'),(3,'kayal','kayal@gmail.com')");
		return "data inserted successfully";
	}
*/

/*@RequestMapping("/update")
public String display()
{
	jdbc.execute("update user set name='Abirami.k.Attur' where id=1");
	return "data updated successfully";
}
*/

/*@RequestMapping("/delete")
public String display()
{
	jdbc.execute("delete from user where id=3");
	return "data deleted successfully";
}
*/

@RequestMapping("/read")
public String display(String name,String email)
{
	jdbc.execute("select * from user where id=1");
	
	
	System.out.println(""+name);
	System.out.println(""+email);
	
	
//	String x = "balu";
//	System.out.println(""+x);
//	String y= "email";
//	System.out.println(""+y);

	
	return "data filter successfully";
}
}
