public abstract class Vehiculo {
    private Motor motor;
    private int wheels, pasajeros;
    private String model;

    public Vehiculo(Motor motor, int wheels, int pasajeros, String model) {
        this.motor = motor;
        this.wheels = wheels;
        this.pasajeros = pasajeros;
        this.model = model;
    }

    //Getters
    public Motor getMotor() {
        return motor;
    }
    public int getWheels() {
        return wheels;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public String getModel() {
        return model;
    }

    //Setters

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        return "Motor: " + this.motor + " Ruedas: " + this.wheels + " Pasajeros: " + this.pasajeros + " Modelo: " + this.model;
    }
    
}
