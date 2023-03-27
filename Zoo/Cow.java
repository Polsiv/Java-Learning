public class Cow extends Herbivoro {

    public Cow() {
        super("Molly", "Female", "Brown");
    }

    @Override
    public void setMeal(String mealType) {
       System.out.println("This cow is fed by: " + mealType);
    }

    @Override
    public void FeedingSchedule(String hour) {
       System.out.println("The time it feeds: " + hour);
    }
    
}
