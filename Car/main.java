public class main {
    public static void main (String[] args){
        car MyCar = new car("Nascar", "Kia", "3935" );

        MyCar.AddWheels(new wheels(4));
        MyCar.ReplaceWheels(new wheels(1), 1);

        System.out.println(MyCar);
    }
}