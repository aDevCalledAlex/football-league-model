package edu.student.football.players.positions;

import edu.student.football.enums.*;
import edu.student.football.players.types.FieldPlayer;

public class Defender extends FieldPlayer{
	public Defender(Role role, String givenName, String surname, String kitName, int kitNumber, int age, 
  			  int height, int contractLength, String clubName, Nationality nationality, Foot foot,
  			  int agility, int flair, int heading, int pass, int shooting, int speed,
  			  int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate,
  			  int marking, int slideTackle, int standingTackle){
		super(role, givenName, surname, kitName, kitNumber, age, 
			  height, contractLength, clubName, nationality, foot);
		trySetAttributes(new DefenderAttributes(speed, agility, flair, heading, pass, shooting, strength, touch, 
												weakfoot, oWorkrate, dWorkrate, marking, slideTackle, standingTackle));
	}

	public class DefenderAttributes extends FieldPlayerAttributes{
		private int marking;
		private int slideTackle;
		private int standingTackle;
		
		public DefenderAttributes(int speed, int agility, int flair, int heading, int pass, int shooting,
		      				      int strength, int touch, int weakfoot, int oWorkrate, int dWorkrate,
		      				      int marking, int slideTackle, int standingTackle){
			super(speed, agility, flair, heading, pass, shooting, 
				  strength, touch, weakfoot, oWorkrate, dWorkrate);
			this.marking = marking;
			this.slideTackle = slideTackle;
			this.standingTackle = standingTackle;
		}
		
		public int getMarking(){ return marking; }
		public int getSlideTackle(){ return slideTackle; }
		public int getStandingTackle(){ return standingTackle; }
	}
}
