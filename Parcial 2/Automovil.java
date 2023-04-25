public class Automovil extends Vehiculo {

    private int puertas;

    public Automovil(Motor motor, int wheels, int pasajeros, String model, int puertas) {
        super(motor, wheels, pasajeros, model);
        this.puertas = puertas;
        this.setRuedas(wheels);
    }

    public void setRuedas(int wheels){
        if(wheels >= 4){
            super.setWheels(wheels);
        } else {
            System.err.println("Se agregaron muy pocas ruedas, por defecto se pondrán 4");
            super.setWheels(4);
        }
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String toString(){
        return super.toString() + " Puertas: " + puertas;
    }
}
