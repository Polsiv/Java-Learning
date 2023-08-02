public class FulltimeEmployee extends Employee{
    private int hours;

    public FulltimeEmployee(String Name, int Age, double Salary, int Hours){
        super(Name, Age, Salary);
        hours = Hours;
    }

    public double Total(){
         return hours * getSalary();
    };

    public String toString() {
        return super.toString() + ", Hours worked: " + hours + ", Total: " + Total(); 
    };
}