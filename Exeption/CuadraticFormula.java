import java.util.Scanner;

public class CuadraticFormula {
    private double a, b, c;

    public CuadraticFormula(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void solve(double a, double b, double c) throws Exception {
        if ((Math.pow(b, 2))- (4*a*c) >= 0){
            double x1 = (-b + Math.sqrt((Math.pow(b, 2)) -4*a*c)/2*a);
            double x2 = (-b - Math.sqrt((Math.pow(b, 2)) -4*a*c)/2*a);

            System.out.println("x1" + x1);
            System.out.println("x2" + x2);
        }
        else{

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     System.out.println("Enter a ");
     double a = input.nextDouble();
     System.out.println("Enter b ");
     double b = input.nextDouble();
     System.out.println("Enter b ");
     double c = input.nextDouble();
    
        try{
            CuadraticFormula equation = new CuadraticFormula(a, b, c);
            equation.solve(a, b, c);
        } catch (Exception e){
            System.out.println("Erorr" + e.getMessage());
        }

    }   
}
