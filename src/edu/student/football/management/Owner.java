package edu.student.football.management;

import edu.student.football.enums.Nationality;

public abstract class Owner implements Comparable<Owner>{

	private int value; // in millions
	private Nationality nationality;
	
	public Owner(int value, Nationality nationality){
		this.value = value;
		this.nationality = nationality;
	}
	
	public int compareTo(Owner otherOwner){
		return this.value - otherOwner.value;
	}
	
	public int getValue(){ return value; }
	public Nationality getNationality(){ return nationality; }
	
	public void setValue(int newValue){ value = newValue; }
	
	public abstract String getName();
	public String toString(){ return getName() + ": $" + value + "m (" + nationality.getCode() + ")"; }

}
