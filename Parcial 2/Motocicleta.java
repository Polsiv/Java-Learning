public class Motocicleta extends Vehiculo{

    private int cilindreria;

    public Motocicleta(Motor motor, int wheels, int pasajeros, String model, int cilindreria) {
        super(motor, 2, 0, model);
        this.cilindreria = cilindreria;
        setPasajeros(pasajeros);
    }

    public int getCilindreria() {
        return cilindreria;
    }

    public void setCilindreria(int cilindreria) {
        this.cilindreria = cilindreria;
    }

   

    public void setPasajeros(int pasajeros){
        if(pasajeros == 1 || pasajeros == 2){
            super.setPasajeros(pasajeros);
            } else {
            System.err.println("Número de pasajeros no válido para la motocicleta");
            super.setPasajeros(2);
        }
    }


    public String toString(){
        return "Motocicleta: " + super.toString() + " Cilindrada: " + cilindreria;
    }
     
}

