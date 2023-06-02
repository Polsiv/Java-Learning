public class Avestruz extends Ave implements Corredor{
    public Avestruz(){
        this.setNombreComun("Avestruz");
        this.setGenero("Struthio");
        this.setEspecie("Camelus");
        this.setPeso(120);
        this.setProcedencia("Tanzania");
        this.setEnvergaduraAlas(2.0);

    }
    @Override
    public void correr() {
        System.out.println("La avestruz corre muy veloz!");
    }

    public String info(){
        return "Nombre Comun: " + this.getNombreComun() + "\n" + "Genero: " +  this.getGenero() + "\n"  + "Especie: " + this.getEspecie() + "\n" + "Peso: " + this.getPeso() + "\n" + "Procedencia: " + this.getProcedencia() + "\n" + "Envergadura Alas: " + this.getEnvergaduraAlas();
    }

}
