public class Duck extends Animal {

    public Duck(String name) {
        super(name);
        this.setSpecie("DUCKY!");
    }

    @Override
    public void SoundEffect() {
      System.out.println("Quack made by: "+ getName());
    }
    
}

