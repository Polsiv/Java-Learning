
// Copyright 2023 Tomás Mancera Villa 98649 - Juan Pablo Silvestre 99127 - Juan Manuel Padilla 97196 - Sebastian Lopez 97500
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalitos= new ArrayList<Animal>();

        animalitos.add(new Titi());
        animalitos.add(new Condor());
        animalitos.add(new Halcon());
        animalitos.add(new Puma());
        animalitos.add(new Avestruz());
        Avestruz aves = new Avestruz();
        aves.correr();

        for(Animal individuo : animalitos){
            System.out.println(individuo.info());

            System.out.println("______________________________");

        }
    }
}