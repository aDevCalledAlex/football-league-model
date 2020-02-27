package edu.student.football.management;

import edu.student.football.enums.Nationality;

public class Chairman extends Member{
	public String qualifyingTitle;
	
	public Chairman(String givenName, String surname, Nationality nationality, String qualifyingTitle){
		super(givenName, surname, nationality);
		this.qualifyingTitle = qualifyingTitle;
	}
	
	public String getQualifyingTitle(){ return qualifyingTitle; }
	
	public String toString(){ return getName() + ": " + qualifyingTitle + "(" + getNationality().getCode() + ")"; }
}
