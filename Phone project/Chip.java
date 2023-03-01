public class Chip {
    private String empresa;
    private int numero;
    
    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    public String toString(){
       return  ("Sim card de la empresa " + this.empresa + " con número "+ this.numero);
    }
    
}
