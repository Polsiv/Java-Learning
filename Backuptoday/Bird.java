public class Bird extends Animal{

    private int IncubationTime;

    public Bird(){

    }

    public void setIncubationTime(int incubationTime) {
        IncubationTime = incubationTime;
    };

    public int getIncubationTime() {
        return IncubationTime;
    }

    @Override
    public String Info() {
       return "S";
    }
}
