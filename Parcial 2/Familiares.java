public class Familiares extends Automovil {

    public Familiares(Motor motor, int wheels, int pasajeros, String model, int puertas) {
        super(motor, 4, 0, model, 0);
    this.setPuertas(puertas);
    this.setPasajeros(pasajeros);
    }

    public void setPasajeros(int pasajeros){
        if(pasajeros > 1 && pasajeros < 6){
            super.setPasajeros(pasajeros);
        } 
        else {
            System.err.println("Número de pasajeros no válido para el carro familiar");
            super.setPasajeros(3);
        }
    }

    public void setPuertas(int puertas){
        if(puertas > 3 && puertas <= 5){
            super.setPuertas(puertas);
        } else {
            System.err.println("Número de puertas no válido para el carro familiar");
            super.setPuertas(4);
        }
    }

    public String toString(){
     return "Vehículo familiar: " + super.toString();
    }
    
}
