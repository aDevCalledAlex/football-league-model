package edu.student.football.management;

import edu.student.football.enums.Nationality;

public class Manager extends Member{
	private int rating;
	
	public Manager(String givenName, String surname, Nationality nationality, int rating) {
		super(givenName, surname, nationality);
		this.rating = rating;
		if(this.rating > 10){
			this.rating = 10;
		}
		else if(this.rating < 1){
			this.rating = 0;
		}
	}

	public void setRating(int newRating){
		rating = newRating;
		if(rating > 10){
			rating = 10;
		}
		else if(rating < 1){
			rating = 1;
		}
	}
}
