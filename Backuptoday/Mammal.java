public abstract class Mammal extends Animal{

    private int GestationTime;

    public Mammal(){

    }

    public int getGestationTime() {
        return GestationTime;
    }

    public void setGestationTime(int gestationTime) {
        GestationTime = gestationTime;
    }

    @Override
    public String Info() {
       return "S";
    };


    

    
}