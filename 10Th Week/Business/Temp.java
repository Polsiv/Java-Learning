public class Temp extends Generic {
    private int weeklyHours, hourValue;

    public Temp(String name, String lastname, int age, int weeklyHours, int hourValue) {
        super(name, lastname, age);
        this.weeklyHours = weeklyHours;
        this.hourValue = hourValue;
    }

    @Override
    public int salary() {
     return (this.weeklyHours * 4) * this.hourValue;
    }

    

}
