package edu.student.football.players.types;

import edu.student.football.enums.*;

public abstract class Footballer{
	private Role role;
	private String givenName;
	private String surname;
	private String kitName;
	private int kitNumber;
	private int age;
	private int height; // in centimeters
	private int contractLength; // in years
	private String clubName;
	private Nationality nationality;
	private Foot foot;
	private FootballerAttributes attributes;
	
	public Footballer(Role role, String givenName, String surname, String kitName, int kitNumber, int age, 
			          int height, int contractLength,String clubName, Nationality nationality, Foot foot){
		this.role = role;
		this.givenName = givenName;
		this.surname = surname;
		this.kitName = kitName;
		this.kitNumber = kitNumber;
		this.age = age;
		this.height = height;
		this.contractLength = contractLength;
		this.clubName = clubName;
		this.nationality = nationality;
		this.foot = foot;
	}
	
	public Role getRole() { return role; }
	public String getGivenName(){ return givenName; }
	public String getSurname(){ return surname; }
	public String getKitName(){ return kitName; }
	public int getKitNumber(){ return kitNumber; }
	public int getAge(){ return age; }
	public int getHeight(){ return height; }
	public int getContractLength(){ return contractLength; }
	public String getClubName(){ return clubName; }
	public Nationality getNationality(){ return nationality; }
	public Foot getFoot(){ return foot; }
	public FootballerAttributes getAttributes(){ return attributes; }

	public boolean trySetAttributes(FootballerAttributes attributes){
		if(!hasAttributes()){
			this.attributes = attributes;
			return true;
		}
		return false;
	}
	
	public boolean hasAttributes(){ return attributes != null; }
	
	
	public abstract class FootballerAttributes{
		private int speed;
		
		public FootballerAttributes(int speed){
			this.speed = speed;
		}
		
		public int getSpeed(){ return speed; }
	}
}
