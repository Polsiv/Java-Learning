public class Camion extends Automovil{

private int capacidad;

    public Camion(Motor motor, int wheels, int pasajeros, String model, int puertas, int capacidad) {
        super(motor, wheels, pasajeros, model, puertas);
        this.setCapacidad(capacidad);
        this.setPuertas(puertas);
        this.setRuedas(wheels);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0 && capacidad <=100){
            this.capacidad = capacidad;
        } else {
            System.err.println("Capacidad no válida");
            this.capacidad = 50;
        }
    }

    public void setRuedas(int ruedas){
        if(ruedas >= 4 && ruedas % 2 == 0){
            super.setRuedas(ruedas);
        }
     else {
        System.err.println("número de ruedas no válido para el camión");
        super.setRuedas(6);
    }
}
    
    public void setPuertas(int puertas){
        if( puertas > 0 && puertas <= 3){
            super.setPuertas(puertas);
        } else{
            System.err.println("Número de puertas equivocado");
            super.setPuertas(2);
        }
    }

    public String toString(){
        return " Camión: " + super.toString() + " Capacidad: " + this.capacidad;
    }

}