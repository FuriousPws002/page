package com.hansy.service;

import java.util.ArrayList;
import java.util.List;

import com.hansy.entity.Pager;
import com.hansy.entity.Person;

public class PageService {

	public Pager selectAll(Pager pager){
		int count = 205;
		List<Person> list=new ArrayList<Person>(); 
		List<Person> rsList=new ArrayList<Person>(); 
		Person p;
		for (int i = 1; i <= count; i++) {
			p=new Person();
			p.setName("name_"+i);
			p.setPass("pass_"+i);
			list.add(p);
		}
		int start=(pager.getPc()-1)*pager.getPs();
		int end=start+pager.getPs();
		end = end<=count?end:count;
		for (int i =start ; i < end ; i++) {
			rsList.add(list.get(i));
		}
		pager.setCount(count);
		pager.setList(rsList);
		return pager;
	}
}
