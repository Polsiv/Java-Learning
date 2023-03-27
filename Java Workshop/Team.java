
public class Team {
    
private String teamName;
private Player[] plantel;
private int capacity = 5;
private int numberPlayers = 0;

public Team (String name){
    this.teamName = name;
    this.plantel = new Player[capacity];
    this.numberPlayers = 0;
    }

public void addPlayer (Player newPlayer){

    if(numberPlayers < 5){
            this.plantel[numberPlayers] = newPlayer;
            numberPlayers ++;
        }
    }

    //Printing out info

    public String toString(){
        String output = "Teams name: " + this.teamName + "\n";
        output += "========Players============" + "\n";
        if(numberPlayers > 0){
            for(Player player: plantel){
                output += player + "\n";
            }
        }
        return output;
    }
}


