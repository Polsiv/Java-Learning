public class App {
    public static void main(String[] args) {
        Motor[] motores=new Motor[3];
        motores[0] = new Electrico(370);
        motores[1] = new Gasolina(450);
        Diesel vin = new Diesel(600);
        motores[2]= vin;

        Vehiculo motico = new Motocicleta(motores[1], 2, "MV Augusta 800", 800);
        Vehiculo van = new Camion(vin, 4, "clase V", 5, 250);

        System.out.println("los datos de la moto son: " + motico);
        System.out.println("los datos de la Van son " + van);
    }
}
