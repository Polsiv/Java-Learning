public class Garden {
    public static void main(String[] args){
        Animal[] mygarden = new Animal[3];

        mygarden[0] = new Cat("Michi");
        mygarden[1] = new Dog("Doggy");
        mygarden[2] = new Duck("Donald");

        for(Animal pet: mygarden){
            pet.SoundEffect();
        }
    }
}
