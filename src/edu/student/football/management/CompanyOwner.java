package edu.student.football.management;

import edu.student.football.enums.Nationality;

public class CompanyOwner extends Owner{
	public String name;
	
	public CompanyOwner(String name, Nationality nationality, int value){
		super(value, nationality);
		this.name = name;
	}
	
	public String getName(){ return name; }
	
	public static void main(String[] args){
		CompanyOwner co = new CompanyOwner("IKEA", Nationality.Netherlands, 150);
		System.out.println(co);
	}
}
