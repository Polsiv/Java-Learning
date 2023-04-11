public class main {
    public static void main(String[] args){
        Generic pepe = new Fij("pepe", "Anon", 23, 1200000, 700000);
        Generic yuli = new Temp("Juliana", "pepe", 32, 345, 23);

        int totalpepe = pepe.salary();
        int totayuli = yuli.salary();

        System.out.println("Pepes salary is " + totalpepe);
        System.out.println("Yulis salary is " + totayuli);
    }
}
