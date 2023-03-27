public class main { 
    public static void main (String[] args){
        car MyCar = new car("Nascar", "Kia", "3935" );

        MyCar.AddWheels(new wheels(4));
        MyCar.AddWheels(new wheels(5));
        MyCar.AddWheels(new wheels(6));
        MyCar.AddWheels(new wheels(1));
        MyCar.AddWheels(new wheels(2));
        MyCar.AddWheels(new wheels(3));


        //MyCar.ReplaceWheels(new wheels(1), 0);

        System.out.println(MyCar);
    }
}