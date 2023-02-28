public class Player {
    private int dorsal;
    private String position;
    private Person p;

    //constructor w/o parameters
    public Player() {
    }

    public Player(int dorsal, String Position, String name, String lastName){
    
    setDorsal(dorsal);
    this.p = new Person(name, lastName);
    this.position = Position;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int n) {
       if (n < 0){
        this.dorsal = 1;
        System.out.println("Dorsal has been setted to 0");
       }

       if (n > 99){
        this.dorsal = 99;
        System.out.println("Dorsal has been setted to 90");
       }
       if ( n > 0 && n < 99){
        this.dorsal = n;
       }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
