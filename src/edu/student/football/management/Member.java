package edu.student.football.management;

import edu.student.football.enums.Nationality;

public abstract class Member{
	private String givenName;
	private String surname;
	private Nationality nationality;
	
	public Member(String givenName, String surname, Nationality nationality){
		this.givenName = givenName;
		this.surname = surname;
		this.nationality = nationality;
	}
	
	public String getGivenName(){ return givenName; }
	public String getSurname(){ return surname; }
	public String getName(){ return givenName + " " + surname; }
	public Nationality getNationality(){ return nationality; }
}
