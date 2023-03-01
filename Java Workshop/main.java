import java.util.Scanner;

class Main{

public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);

Person newperson1 = new Person ("Silv", "Constaint");

System.out.println(newperson1);

//Creating new Player

System.out.println("Enter your name: ");
String name = keyboard.nextLine();

System.out.println("Enter your Last name: ");
String lastName = keyboard.nextLine();

System.out.println("Enter your position ");
String position = keyboard.nextLine();

System.out.println("Enter your dorsal: ");
int dorsal = keyboard.nextInt();


//Passing parameters to class Player
Player player1 = new Player(dorsal, position, name, lastName);

System.out.println(player1);

keyboard.close();

    }
}   