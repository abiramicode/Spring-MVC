package com.i18n.firstdemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class serv1 {
	List<student> l1=new ArrayList<student>(Arrays.asList(new student("Abi",21,01,"i18n")));

	public List<student> getservice()
	{
		return l1;
	}
	public void add(student s)
	{
		l1.add(s);
		
	}
}
