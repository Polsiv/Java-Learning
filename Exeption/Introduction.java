import java.util.Scanner;

public class Introduction{
    public static void main(String[] args) {
        int a, b;

Scanner input = new Scanner(System.in);

try{
    System.out.println("Enter a");

a = input.nextInt();

System.out.println("Enter b");

b = input.nextInt();

System.out.println("The value is: " + (a/b));


} catch (Exception e){
  System.out.println("Error: " + e.getMessage());
        }

        finally{
            input.close();
            System.out.println("Program executed.");
        }
    }
}