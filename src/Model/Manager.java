package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leagueTeams;
	
	public Manager(){
		//TODO: IMPLEMENT THIS TOO
	}
	
	public void DisplayTopScoringMatches(){
		//TODO: IMPLEMENT THIS
	}
	public void DisplayTop5Players(){
		//TODO: IMPLEMENT THIS
	}
	public void DisplayTopGoalie(){
		for(Team t : leagueTeams)
		{
			t.getPlayers();
			for(Player p : t)
			{
				
			}
			
			
		}
	}
	
	public static void main(String args[]){
		Manager m = new Manager();
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}
