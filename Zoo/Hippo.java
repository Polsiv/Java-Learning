public class Hippo extends Herbivoro {
    public Hippo(){
        super("HipoTech", "Female", "Gray");
    }

    @Override
    public void setMeal(String mealType) {
    System.out.println("This hippo is fed by:" + mealType);
    }

    @Override
    public void FeedingSchedule(String hour) {
       System.out.println("It feeds at: " + hour);
    }
}
