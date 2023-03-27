public class Cat extends Felino{

    public Cat() {
        super("idk", "male", "Silv");
    }

    @Override
    public void setMeal(String mealType) {
       System.out.println("This cat is fed by " + mealType);
    }

    @Override
    public void FeedingSchedule(String hour) {
        System.out.println("The time it feeds " + hour);
    }
    
}
