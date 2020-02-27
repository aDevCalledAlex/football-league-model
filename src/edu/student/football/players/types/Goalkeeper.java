package edu.student.football.players.types;

import edu.student.football.enums.*;

public class Goalkeeper extends Footballer{
	public Goalkeeper(Role role, String givenName, String surname, String kitName, int kitNumber, int age, 
	                  int height, int contractLength,String clubName, Nationality nationality, Foot foot,
	                  int speed, int distribution, int diving, int drop, int footwork, int handling){
		super(role, givenName, surname, kitName, kitNumber, age,
			  height, contractLength, clubName, nationality, foot);
		trySetAttributes(new GoalkeeperAttributes(speed, distribution, diving, drop, footwork, handling));
	}
	
	public class GoalkeeperAttributes extends FootballerAttributes{
		private int speed;
		private int distribution;
		private int diving;
		private int drop;
		private int footwork;
		private int handling;
		
		public GoalkeeperAttributes(int speed, int diving, int footwork, int drop, int distribution, int handling){
			super(speed);
			this.distribution = distribution;
			this.diving = diving;
			this.drop = drop;
			this.footwork = footwork;
			this.handling = handling;
		}
		
		public int getSpeed(){ return speed; }
		public int getDistribution(){ return distribution; }
		public int getDiving(){ return diving; }
		public int getDrop(){ return drop; }
		public int getFootwork(){ return footwork; }
		public int getHandling(){ return handling; }
	}
}
