import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        

        int[] values = new int[5];
        for(int i = 0; i < values.length; ++i){
            values[i] = 0;
        }

        for(int i = 1; i < values.length; ++i){
                
            System.out.println("Enter the " + (i + 1) + " Number: ");
            values[i] = input.nextInt();
        }


        try{
            System.out.println("The average is " + values[3] / values[0] );
        }  
        catch(Exception e){
            System.out.println("Theres a problem! " + e.getMessage());
        }

        finally{
            input.close();
            System.out.println("Program closed.");
        }
    }
}