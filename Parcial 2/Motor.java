public abstract class Motor {
    private int potencia;
    private String tipo;

    //constructor
    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "(potencia: " + this.potencia + " Tipo: " + this.tipo + ")";

    }

}