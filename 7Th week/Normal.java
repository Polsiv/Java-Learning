public class Normal extends Employed{
    private double payment;

    public Normal(String idCarnet, String name, String lastName, double payment) {
        super(idCarnet, name, lastName);
        this.payment = payment;
    }

    @Override
    public String toString() {
        return super.toString()  + "\nNormal: \n Payment=" + payment;
    }
    
    
    
}
