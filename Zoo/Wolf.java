public class Wolf extends Felino {

    public Wolf() {
        super("Sven","Male", "Doggie");
    }

    @Override
    public void setMeal(String mealType) {
       System.out.println("Wolf fed by: " + mealType);
    }

    @Override
    public void FeedingSchedule(String hour) {
        System.out.println("The schedule it feeds: " + hour);
    }
}
