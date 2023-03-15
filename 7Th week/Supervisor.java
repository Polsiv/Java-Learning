public class Supervisor extends Employed{
    private double payment, commission, total;

    public Supervisor(String idCarnet, String name, String lastName, double payment, double commission) {
        super(idCarnet, name, lastName);
        setTotal(payment, commission);
    }


    public void setTotal(double a, double b){
    this.payment = a;
    this.commission = b;
    this.total = b + a;
    };

    public double getTotal(){
        return total;
    }

    @Override
    public String toString() {
        return super.toString()  +"\nSupervisor: \n payment=" + payment + ", commission=" + commission + " Total" + this.getTotal();
    }
}
