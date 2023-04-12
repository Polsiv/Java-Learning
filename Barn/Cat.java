public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.setName("Homecat");
    }

    @Override
    public void SoundEffect() {
      System.out.println("Miau made by: " + getName());
    }
    
}
