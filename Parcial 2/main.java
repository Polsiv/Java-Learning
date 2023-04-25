public class main {
    public static void main(String[] args){

        Motor motor1 = new Diesel(3000);
        Motor motor2 = new Gasolina(2000);
        Motor motor3 = new Electrico(1000);
        Motor motor4 = new Electrico(5000);

    Vehiculo moto = new Motocicleta(motor2, 2, 2, "3002", 2);

    Vehiculo deportivo = new Deportivo(motor1, 2, 2, "2003", 3);

    Vehiculo autofamiliar = new Familiares(motor3, 4, 2, "2005", 4);

    Vehiculo camion = new Camion(motor4, 4, 2, "1004", 3, 30);

    System.out.println(moto);
    System.out.println(deportivo);
    System.out.println(autofamiliar);
    System.out.println(camion);

    }

}