public abstract class Mamifero {
    private String commonName, gender, especie, tipo;

    Mamifero(String CN, String Gen, String esp){
    this.commonName = CN;
    this.gender = Gen;
    this.especie = esp;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

public abstract void FeedingSchedule(String hour);

    public String toString() {
        return "Mammal: \n commonName: " + commonName + ", gender: " + gender + ", type: " + especie;
    }
}