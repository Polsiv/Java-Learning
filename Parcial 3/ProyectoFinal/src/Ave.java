public abstract class Ave extends Animal {
    private double envergaduraAlas;
    public Ave(){

    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        if(envergaduraAlas < 0){
            System.err.println("La envergadura de las alas no puede ser negativa");
            envergaduraAlas = 1;
        }
        this.envergaduraAlas = envergaduraAlas;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }
    public abstract String info();


}
