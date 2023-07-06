package com;
import java.util.*;

public class Person {
	private Integer pid;
	private String name;
	
	private String[] hobbies;
	private ArrayList<String> emails;
	private HashSet<String> phones;
	private HashMap<String, String> education;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public ArrayList<String> getEmails() {
		return emails;
	}
	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}
	public HashSet<String> getPhones() {
		return phones;
	}
	public void setPhones(HashSet<String> phones) {
		this.phones = phones;
	}
	public HashMap<String, String> getEducation() {
		return education;
	}
	public void setEducation(HashMap<String, String> education) {
		this.education = education;
	}
	
	

}
