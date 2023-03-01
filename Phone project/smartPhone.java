import java.util.ArrayList;

public class smartPhone {
private String modelo;
private Bateria bateria;
private ArrayList<Chip> SIM;


smartPhone(String model, int cantMah, String marcaBateria){
    this.modelo = model;
    this.bateria = new Bateria(cantMah, marcaBateria);
    this.SIM = new  ArrayList<Chip>();

    }

    public void agregarChip(Chip nuevo){
        if(SIM.size() < 2){
            SIM.add(nuevo);
           
        } else {
            System.err.println("SE ha sobrepasado la cantidad de chips");
        }

    }

    public String toString(){
    String output = " Smartphone modelo: " + this.modelo + "\n";
    output += bateria.toString() + "\n";
    output += " Sim cards: ";
    for(Chip chip: SIM){
        output += chip + "\n";

        } 
        return output;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }
}
