package edu.student.football.enums;

public enum Nationality{
	Argentina ("ARG", "Argentinian"),
	Belgium ("BEL", "Belgian"),
	Brazil ("BRA", "Brazilian"),
	Chile ("CHI", "Chilean"),
	Croatia ("CRO", "Croatian"),
	England ("ENG", "English"),
	France ("FRA", "French"),
	Germany ("GER", "German"),
	Italy ("ITA", "Italian"),
	Netherlands ("NED", "Dutch"),
	Poland ("POL", "Polish"),
	Spain ("ESP", "Spanish"),
	Sweden ("SWE", "Swedish"),
	Switzerland ("SUI", "Swiss"),
	UnitedStates("USA", "American");
	
	private final String code;
	private final String demonym;
	
	Nationality(String code, String demonym){
		this.code = code;
		this.demonym = demonym;
	}
	
	public String getCode(){ return code; }
	public String getDemonym(){ return demonym; }
}
