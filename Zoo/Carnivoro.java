public abstract class Carnivoro extends Mamifero {

    public Carnivoro(String CN, String Gen, String esp) {
        super(CN, Gen, esp);
        super.setTipo("Carnivorous");
    }   
public abstract void setMeal(String mealType);
}
