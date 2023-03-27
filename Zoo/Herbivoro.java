public abstract class Herbivoro extends Mamifero {

    public Herbivoro(String CN, String Gen, String esp) {
        super(CN, Gen, esp);
        super.setTipo("Herbivorous");
    }
    public abstract void setMeal(String mealType);
}
