import java.util.Scanner;

class Main{

public static void main (String[] args){

Person me = new Person();

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter your name!");
me.setName(keyboard.nextLine());

System.out.println("Enter your last name!");    
me.setLastName(keyboard.nextLine());

keyboard.close();

System.out.println(me);

Person newperson1 = new Person ("Pedro", "Martinez");

System.out.println(newperson1);

    }
}