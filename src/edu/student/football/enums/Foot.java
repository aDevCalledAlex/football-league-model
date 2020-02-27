package edu.student.football.enums;

public enum Foot {
	Left("L"),
	Right("R");
	
	private final String symbol;
	
	Foot(String symbol){
		this.symbol = symbol;
	}
	
	public String getSymbol(){ return symbol; }
}
