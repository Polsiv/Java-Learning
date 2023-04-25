public class Automovil extends Vehiculo{
    protected int puertas;

    public Automovil(Motor motor, int ruedas, int pasajeros, String modelo, int puertas) {
        super(motor, 0, pasajeros, modelo);
        this.setRuedas(ruedas);
        this.puertas = puertas;
    }

    
    @Override
    public void setRuedas(int ruedas) {
       if (ruedas >= 4) {
        super.setRuedas(ruedas);
       } else {
        System.err.println("el número de ruedas es muy bajo.");
        super.setRuedas(4);
       }
        
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return  super.toString()+ " puertas=" + puertas ;
    }
    
    
}
