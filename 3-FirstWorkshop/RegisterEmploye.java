
import java.util.ArrayList;

public class RegisterEmploye{
    
    private ArrayList<Employee> employees;

    public RegisterEmploye(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emmployee){
        employees.add(emmployee);
    }

    public void showEmployees(){
        for(Employee employee: employees){
            System.out.println(employee);
        }
    }

}