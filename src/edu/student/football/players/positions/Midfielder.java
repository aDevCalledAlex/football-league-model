package edu.student.football.players.positions;

import edu.student.football.enums.*;
import edu.student.football.players.types.FieldPlayer;

public class Midfielder extends FieldPlayer{

	public Midfielder(Role role, String givenName, String surname, String kitName, int kitNumber, int age, 
     	   			  int height, int contractLength, String clubName, Nationality nationality, Foot foot,
     	   			  int agility, int flair, int heading, int pass, int shooting, int speed,
     	   			  int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate,
     	   			  int freeKick, int longPass, int vision){
		super(role, givenName, surname, kitName, kitNumber, age, 
		      height, contractLength, clubName, nationality, foot);
		trySetAttributes(new MidfielderAttributes(speed, agility, flair, heading, pass, shooting, strength, touch, 
										       	  weakfoot, oWorkrate, dWorkrate, freeKick, longPass, vision));
	}
	
	public class MidfielderAttributes extends FieldPlayerAttributes{
		private int freeKick;
		private int longPass;
		private int vision;
		
		public MidfielderAttributes(int speed, int agility, int flair, int heading, int pass, int shooting,
                				    int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate,
                				    int freeKick, int longPass, int vision){
			super(speed, agility, flair, heading, pass, shooting, 
				  strength, touch, weakfoot, oWorkrate, dWorkrate);
			this.freeKick = freeKick;
			this.longPass = longPass;
			this.vision = vision;
		}
		
		public int getFreeKick(){ return freeKick; }
		public int getLongPass(){ return longPass; }
		public int getVision(){ return vision; }
	}

}
