package edu.student.football.players.types;

import edu.student.football.enums.*;

public abstract class FieldPlayer extends Footballer{
	
	public FieldPlayer(Role role, String givenName, String surname, String kitName, int kitNumber, int age, 
	                   int height, int contractLength, String clubName, Nationality nationality, Foot foot){
			super(role, givenName, surname, kitName, kitNumber, age, height, 
			      contractLength, clubName, nationality, foot);
	}
	
	public abstract class FieldPlayerAttributes extends FootballerAttributes{
		private int agility;
		private int flair;
		private int heading;
		private int pass;
		private int shooting;
		private int strength;
		private int touch;
		private int weakfoot;
		private int oWorkrate; // offensive
		private int dWorkrate; // defensive
		
		public FieldPlayerAttributes(int speed, int agility, int flair, int heading, int pass, int shooting,
					   			int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate){
			super(speed);
			this.agility = agility;
			this.flair = flair;
			this.heading = heading;
			this.pass = pass;
			this.shooting = shooting;
			this.strength = strength;
			this.touch = touch;
			this.weakfoot = weakfoot;
			this.oWorkrate = oWorkrate;
			this.dWorkrate = dWorkrate;
		}

		public int getAgility(){ return agility; }
		public int getFlair(){ return flair; }
		public int getHeading(){ return heading; }
		public int getPass(){ return pass; }
		public int getShooting(){ return shooting; }
		public int getStrength(){ return strength; }
		public int getTouch(){ return touch; }
		public int getWeakfoot(){ return weakfoot; }
		public int getoWorkrate(){ return oWorkrate; }
		public int getdWorkrate(){ return dWorkrate; }
	}
}
