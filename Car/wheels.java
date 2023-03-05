public class wheels {
    private int comp;

    public wheels(int Compuesto){
        setComp(Compuesto);
    }

    @Override
    public String toString() {
        return ("Wheel's compuesto: " + getComp());
    }

    

    public int getComp() {
        return comp;
    }
    
    public void setComp(int comp) {
        if(comp < 0){
            System.err.println("Compuesto cant be less than 0");
            this.comp = 0;
        }
        if(comp > 6){
            System.err.println("Compuesto cant greater than 6");
            this.comp = 6;
        }
        if(comp >= 0 && comp <= 6){
            this.comp = comp;
        }
    }
}
