public class Temporal extends Employed {
    private double total;
    private int hours;

    public Temporal(String idCarnet, String name, String lastName,  int hours) {
        super(idCarnet, name, lastName);
        setTotal(hours);
    }

    public void setTotal(int h){

        this.hours = h;
        this.total = this.hours * 7;
    }

    public double getTotal(){
        return this.total;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemporal: \n total= " + getTotal() + ", hours= " + hours;
    }

    
    
}
