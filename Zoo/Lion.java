public class Lion extends Felino {

    public Lion() {
        super("lmfao", "Male", "Silvestre");        
    }

    @Override
    public void setMeal(String mealType) {
        System.out.println("This lion is fed by" + mealType);
    }

    @Override
    public void FeedingSchedule(String hour) {
        System.out.println("The time it feeds " + hour);
    }
    
}
