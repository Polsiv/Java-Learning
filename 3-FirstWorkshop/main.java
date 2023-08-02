public class main{
    public static void main(String[] args) {
       RegisterEmploye register = new RegisterEmploye();

       Employee id1 = new FulltimeEmployee("Rick", 30, 4800, 40);
       register.addEmployee(id1);

       Employee id2 = new EmployeePerhours("Astelic", 25, 3000d, 300);
       register.addEmployee(id2);

       register.showEmployees();
    }
}