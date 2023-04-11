public class Fij extends Generic{
    private int salary, prima;

    public Fij(String name, String lastname, int age, int salary, int prima) {
        super(name, lastname, age);
        this.salary = salary;
        this.prima = prima;
    }

    @Override
    public int salary() {
       return this.prima + this.salary;
    }
    
}
