package edu.student.football.players.positions;

import edu.student.football.enums.*;
import edu.student.football.players.types.FieldPlayer;

public class Forward extends FieldPlayer{
	public Forward(Role role, String givenName, String surname, String kitName, int kitNumber, int age, 
            	   int height, int contractLength, String clubName, Nationality nationality, Foot foot,
            	   int agility, int flair, int heading, int pass, int shooting, int speed,
            	   int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate,
				   int finish, int longShot, int penalties){
		super(role, givenName, surname, kitName, kitNumber, age, 
			  height, contractLength, clubName, nationality, foot);
		trySetAttributes(new ForwardAttributes(speed, agility, flair, heading, pass, shooting, strength, touch, 
											   weakfoot, oWorkrate, dWorkrate, finish, longShot, penalties));
	}
	
	public class ForwardAttributes extends FieldPlayerAttributes{
		private int finish;
		private int longShot;
		private int penalties;
		
		public ForwardAttributes(int speed, int agility, int flair, int heading, int pass, int shooting,
				                 int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate,
				                 int finish, int longShot, int penalties){
			super(speed, agility, flair, heading, pass, shooting, 
				  strength, touch, weakfoot, oWorkrate, dWorkrate);
			this.finish = finish;
			this.longShot = longShot;
			this.penalties = penalties;
		}
		
		public int getFinish(){ return finish; }
		public int longShot(){ return longShot; }
		public int getPenalties(){ return penalties; }
	}
}
