public class EmployeePerhours extends Employee{
    private double salaryPerHour;
  

    public EmployeePerhours(String Name, int Age, double Salary, double SalaryPerHour) {
        super(Name, Age, Salary);
        this.salaryPerHour = SalaryPerHour;
    }

    public double Total(){
        return salaryPerHour * getSalary();
    }

    @Override

    public String toString() {
        return super.toString() + ", Salary per Hour: " + salaryPerHour + ", Total: " + Total(); 
    };
}
