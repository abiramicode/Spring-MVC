package com.i18n.firstdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class serv5 {
	List<student> l1=new ArrayList<student>(Arrays.asList(new student("Abi",21,01,"i18n"),(new student("Balu",25,02,"i18n"))));

	public List<student> getservice()
	{
		return l1;
	}
	public void add(student s)
	{
		l1.add(s);
		
	}
	
	public void updatamystudent(String nam,student s)
	{
		for(int i=0;i<l1.size();i++)
		{
			student s1=l1.get(i);
			if(s1.getName().equals(nam))
			{
				l1.set(i,s);
			}
		}
	}
	
}