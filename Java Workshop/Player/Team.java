public class Team {
private String teamName;                                                                                                                                                                                                                 teamName;
private Player[] plantel;
private int capacity = 5;
private int NumPlayers;


public Team(String teamname){

    this.teamName = teamname;
    this.plantel = new Player[5];
    this.NumPlayers = 0;

}

public void AddPlayer(Player player){
        int counter = 0;
     if(plantel.length <capacity){
        plantel[counter] = player;
        counter ++;
     } else {
        System.err.println("Team alraedy completed!");
     }
    } 

public String toString(){

String output = "Team " + this.teamName + "\n";
output += "======Player======";
if(NumPlayers > 0){
    for(Player jugador: plantel){
        output += jugador + "\n";
            }
        }          
        return output;
    }
}