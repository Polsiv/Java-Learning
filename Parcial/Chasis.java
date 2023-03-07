public class Chasis {
    private String referencia;
    private int peso;

    //constructor
    public Chasis (String referencia, int peso ){
        setPeso(peso);
        this.referencia = referencia;
    }

//Mostrar============================

@Override
public String toString() {
    return " Referencia=" + this.referencia + ", Peso=" + getPeso();
} 


//getters============================
    public String getReferencia() {
        return referencia;
        }   

    public int getPeso() {
        return peso;
        }

//setters=============================

public void setReferencia(String ref) {
    this.referencia = ref;
    }

public void setPeso(int pes) {
    if ( pes < 600){
        System.err.println("El peso no puede ser menor a 600");
        this.peso = 600;
        }
    if (pes >= 600){
        this.peso = pes;
        }
    }
}

