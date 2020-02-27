package edu.student.football.club;

import edu.student.football.enums.Nationality;
import edu.student.football.management.*;
import edu.student.football.players.types.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Club{
	private String name;
	private String code;
	private String nickname;
	private Owner owner;
	private Chairman chairman;
	private Manager manager;
	private HashMap<String, Footballer> playerRegistry;
	private Footballer keyPlayer;
	
	public Club(String name, String code, String nickname, Owner owner){
		this.name = name;
		this.code = code;
		this.owner = owner;
	}
	
	public Club(String name, String code, String nickname, Owner owner, Chairman chairman, Manager manager){
		this.name = name;
		this.code = code;
		this.owner = owner;
		this.chairman = chairman;
		this.manager = manager;
	}
	
	public Club(String name, String code, String nickname, Owner owner, Chairman chairman, Manager manager, HashMap<String, Footballer> playerRegistry){
		this.name = name;
		this.code = code;
		this.owner = owner;
		this.chairman = chairman;
		this.manager = manager;
		this.playerRegistry = playerRegistry;
	}

	public void setOwner(Owner newOwner){ owner = newOwner; }
	public void setChairman(Chairman newChairman){ chairman = newChairman; }
	public void setManager(Manager newManager){ manager = newManager; }
	public void setKeyPlayer(Footballer newKeyPlayer){ keyPlayer = newKeyPlayer; }
	
	public String toString(){ return name + " {" + "\n\towner: " + owner + "\n\tchairman: " + chairman 
									+ "\n\tmanager: " + manager + "\n\tkeyPlayer: " + keyPlayer + "\n}";
	}
	
//	public void signPlayer(Footballer newPlayer){ playerRegistry.put(newPlayer, value)
	
	public static void main(String[] args){
		Owner elliot = new CompanyOwner("Elliot Advisors", Nationality.UnitedStates, 35000);
		Chairman scaroni = new Chairman("Paolo", "Scaroni", Nationality.Italy, "Former CEO of Eni");
		Manager gattuso = new Manager("Genaro", "Gattuso", Nationality.Italy, 6);
		Club club = new Club("AC Milan", "MIL", "Milan", elliot, scaroni, gattuso);
	}
}
