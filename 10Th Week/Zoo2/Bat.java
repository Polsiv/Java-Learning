public class Bat extends Mamma{

    public Bat() {
        super("El pepe", "Female", "lol");
    }
    
    public void fly(){
        System.out.println("OMG IM FLYING!");
    }

    @Override
    public void pregnancy() {
        System.out.println("NEW BABY BATTY INC! 70-90 BUSINESS DAYS");
    }
    
}
