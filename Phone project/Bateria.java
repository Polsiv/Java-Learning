public class Bateria {
    private int mAh;
    private String marca;
    
    public Bateria(int mAh, String marca) {
        this.mAh = mAh;
        this.marca = marca;
    }

    public String toString(){
       
    return ("Batería marca " + this.marca + " de " + this.mAh + " mAh ");
    } 
}
