package com.i18n.firstdemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class serv2 {
	List<student> l1=new ArrayList<student>(Arrays.asList(new student("Abi",21,01,"i18n")));

	public List<student> getservice()
	{
		return l1;
	}
	
	public student getservice(String nam)
	{
	return l1.stream().filter(t->t.getName().equals(nam)).findFirst().get();
	}
}