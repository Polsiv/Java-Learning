
public class Hawk extends Bird implements Hunter, Flying {
 public Hawk(){
        super();
        this.setName("Zari");
        this.setGender("Guella");
        this.setSpecie("Blacky");
        this.setIncubationTime(3);
        setFunfact("This bird does exists!");   
    }

@Override
public void Fly() {
    System.out.println("This Hawk Flies");
}

@Override
public void Hunt() {
  System.out.println("This Hawk Hunts animals");
    }    
}