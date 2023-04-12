public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.setSpecie("Pincher");
    }

    @Override
    public void SoundEffect() {
      System.out.println("Wof made by: " + getName());
    }
    
}

