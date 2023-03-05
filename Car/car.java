import java.util.ArrayList;

public class car {
    private String Team;
    private motor Motor;
    private ArrayList<wheels> Wheel;


//constructor=====================================================================

    public car (String team, String brand, String serial){
    this.Team = team;
    this.Motor = new motor(brand, serial);
    this.Wheel = new ArrayList<wheels>();
    }
    
//=============================================================================

    @Override
    public String toString() {
        String output = "Team: " + this.Team + "\n";
        output += "Motor: " + this.Motor.toString() + "\n";
        output += "Wheels:" + "\n";

        for(wheels wheels: Wheel){
            output += wheels + "\n";
        }
        return output;
    }

//======================================================================

    public void AddWheels (wheels newWheel){
        if(Wheel.size() < 7){
            Wheel.add(newWheel);
        } else {
            System.err.println("No more wheels allowed!");
        }
    }

//===================================================
    public void ReplaceWheels(wheels ReplacedWheel, int index){
       Wheel.set(index, ReplacedWheel);
    }
};

