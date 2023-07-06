package com;
import java.util.*;
public class Question {
	private int id;
	private String name;
	private List<String>answers;
	private Set ph;
	
	public Question (int id, String name, List<String> answers, Set ph) {
		Super();
		this.id = id;
		this.name = name;
		this.answers = answers;
		this.ph = ph;
		
	}
	
	public void display() {
		System.out.println(id + " : "+ name);
		System.out.println("Answerts....!");
		
		Iterator i = answers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Number...!");
		
		Iterator phone = ph.iterator();
		while(phone.hasNext()) {
			System.out.println(phone.next());
		}
	}
	
	
	

}
