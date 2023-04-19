public class Fox extends Mammal implements Hunter {

    public Fox (){
        this.setName("Richard");
        this.setGender("Vulpes");
        this.setSpecie("vUL2");
        this.setFunfact("It's funny as fuck!");
    }

    @Override
    public void Hunt() {
        System.out.println("This animal is real");;
    }


    public String Info(){
        return "Name: " + this.getName() + " Gender: " + this.getGender() + " Specie: " + this.getSpecie() + " Fun fact" + this.getFunfact();
    }
}
