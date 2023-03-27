public class Fox extends Canine {

    public Fox() {
        super("Loopy", "Male", "Red");   
    }

    @Override
    public void setMeal(String mealType) {
       System.out.println("This fox is fed by:" + mealType);
    }

    @Override
    public void FeedingSchedule(String hour) {
       System.out.println("The time he feeds: " + hour);
    }
    
}
