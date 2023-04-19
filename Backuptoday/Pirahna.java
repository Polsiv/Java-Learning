public class Pirahna extends Fish implements Swimmer {
    
public Pirahna(){
    super();
    this.setName("Pepepga");
    this.setGender("Tooth");
    this.setSpecie("Kekw");
    this.setFunfact("This does exist");
    this.setAtomosphere("Water");
    }

@Override
public void Swim() {
   System.out.println("Omg im swimming!");
}


public String Info(){
        return "Name: " + this.getName() + " Gender: " + this.getGender() + " Specie: " + this.getSpecie() + " Fun fact" + this.getFunfact() + " Atmosphere: " + this.getAtomosphere();
 }
}
