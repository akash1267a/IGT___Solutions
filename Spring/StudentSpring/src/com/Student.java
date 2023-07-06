package com;

public class Student {
	public Student(int sID, String sName, int smarks, String sSection) {
		super();
		SID = sID;
		SName = sName;
		Smarks = smarks;
		SSection = sSection;
	}
	private int SID;
	private String SName;
	private int Smarks;
	private String SSection;
	
	public void display() {
		System.out.println(SID);
		System.out.println(SName);
		System.out.println(Smarks);
		System.out.println(SSection);
	}
	
	
}

