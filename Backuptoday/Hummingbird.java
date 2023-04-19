public class Hummingbird extends Bird implements Flying {
    
public Hummingbird(){
    super();
    this.setName("My Hummingbird");
    this.setGender("Female");
    this.setSpecie("Common");
    this.setFunfact("90RPM");
    this.setIncubationTime(23);
}

@Override
public void Fly() {
    System.out.println("This Hummingbird  Flies");
}

public String Info(){
    return "Name: " + this.getName() + " Gender: " + this.getGender() + " Specie: " + this.getSpecie() + " Fun fact" + this.getFunfact() + " Atmosphere: " + this.getIncubationTime();
    }
}



