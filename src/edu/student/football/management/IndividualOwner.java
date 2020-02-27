package edu.student.football.management;

import edu.student.football.enums.Nationality;

public class IndividualOwner extends Owner{
	private String givenName;
	private String surname;
	
	public IndividualOwner(String givenName, String surname, Nationality nationality, int value) {	
		super(value, nationality);
		this.givenName = givenName;
		this.surname = surname;
		
	}
	
	public String getGivenName(){ return givenName; }
	public String getSurname(){ return surname; }
	public String getName(){ return givenName + " " + surname; }

	
	public static void main(String[] args) {
		Owner owner = new IndividualOwner("Frank", "Johnson", Nationality.Italy, 10);
		System.out.println(owner);
	}
}
