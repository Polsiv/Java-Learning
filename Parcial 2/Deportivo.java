public class Deportivo extends Automovil {

    public Deportivo(Motor motor, int wheels, int pasajeros, String model, int puertas) {
        super(motor, 4, 2, model, 0);
        this.setPuertas(puertas);
    }

    @Override

    public void setPuertas(int puertas){
        if (puertas <= 3 && puertas > 0){
            super.setPuertas(puertas);
        } else{
            System.err.println("Número de puertas equivocado para el vehículo deportivo");
            super.setPuertas(2);
        }
    }

    public String toString(){
        return "Deportivo: " + super.toString();
    }
}
