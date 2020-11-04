package com.onlystrings;

public class Interviewq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Tutorial{
			public String name;
			public Tutorial(String tutorial) {
				name = tutorial;
			}
		}
	Object obj = new Tutorial("Java");
	Tutorial tutorial = (Tutorial) obj;
	System.out.println(tutorial.name);
	}

}
