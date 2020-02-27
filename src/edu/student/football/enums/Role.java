package edu.student.football.enums;

public enum Role{
	ST("Striker", Position.Forward),
	CF("Center Forward", Position.Forward),
	LW("Left Wing", Position.Forward),
	RW("Right Wing", Position.Forward),
	AM("Attacking Mid", Position.Midfielder),
	LM("Left Mid", Position.Midfielder),
	CM("Center Mid", Position.Midfielder),
	RM("Right Mid", Position.Midfielder),
	DM("Defensive Mid", Position.Midfielder),
	LWB("Left Wingback", Position.Defender),
	LB("Left Back", Position.Defender),
	CB("Center Back", Position.Defender),
	RB("Right Back", Position.Defender),
	RWB("Right Wingback", Position.Defender),
	GK("Goalkeeper", Position.Goalkeeper);
	
	private String name;
	private Position position;
	
	Role(String name, Position position){
		this.name = name;
		this.position = position;
	}
	
	public String getName(){ return name; }
	public Position getPosition(){ return position; }
}
