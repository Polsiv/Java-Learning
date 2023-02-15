import java.util.Scanner;

public class basketball {
    public static void main (String[] args){

players Player1 = new players();

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter the players name");
Player1.setName(keyboard.nextLine());

System.out.println("Enter the players name");
Player1.setLastName(keyboard.nextLine());

System.out.println("Enter the players name");
Player1.setHeight(keyboard.nextDouble());

System.out.println("Enter the players name");
Player1.setAge(keyboard.nextInt());

System.out.println("Enter the players name");
Player1.setDorsal(keyboard.nextInt());

System.out.println("Enter the players name");
Player1.setPosition(keyboard.nextLine());


keyboard.close();

System.out.println(Player1);
    }
}
