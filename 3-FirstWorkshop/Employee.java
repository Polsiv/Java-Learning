public class Employee {
    private String name;
    private int age;
    private double salary;
    
    public Employee(String Name, int Age, double Salary){
        this.name = Name;
        this.age = Age;
        this.salary = Salary;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    
    public String toString(){
        return "Employee: \n Name: " + name + ", Age: " + age + ", Salary:" + salary; 
    }
}