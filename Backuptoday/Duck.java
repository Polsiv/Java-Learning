public class Duck extends Bird implements Flying, Swimmer{
    public Duck(){
        super();
        this.setName("Silv");
        this.setGender("Anas");
        this.setSpecie("Platyrynchos");
        this.setIncubationTime(2);
        setFunfact("This bird exists");   
    }

    @Override
    public void Swim() {
        System.out.println("Ducky swims");
    }

    @Override
    public void Fly() {
        System.out.println("ducky flies");
    }

    public String info(){
        return "Name: " + this.getName() + " Gender: " + this.getGender() + " Specie: " + this.getSpecie() + " Fun fact: " + this.getFunfact();
    }
}
