public abstract class Vehiculo {
    protected Motor motor;
    protected int ruedas;
    protected int pasajeros;
    protected String modelo;

    

    public Vehiculo(Motor motor, int ruedas, int pasajeros, String modelo) {
        this.motor = motor;
        this.ruedas = ruedas;
        this.pasajeros = pasajeros;
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "motor=" + motor + ", ruedas=" + ruedas + ", pasajeros=" + pasajeros + ", modelo=" + modelo
                ;
    }

    
}
