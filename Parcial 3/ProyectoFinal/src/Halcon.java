public class Halcon extends Ave implements Volador,Cazador{
    public Halcon(){
        this.setNombreComun("Halcon moteado");
        this.setGenero("Falco");
        this.setEspecie("Punctatus");
        this.setPeso(0.25);
        this.setProcedencia("Isla Mauricio");
        this.setEnvergaduraAlas(0.52);

    }

    @Override
    public void cazar() {
        System.out.println("EL halcon suele cazar aves mas pequeñas");
    }

    @Override
    public void volar() {
        System.out.println("El halcon vuela a grandes velocidades");

    }

    public String info(){
        return "Nombre Comun: " + this.getNombreComun() + "\n" + "Genero: " +  this.getGenero() + "\n"  + "Especie: " + this.getEspecie() + "\n" + "Peso: " + this.getPeso() + "\n" + "Procedencia: " + this.getProcedencia() + "\n" + "Envergadura Alas: " + this.getEnvergaduraAlas();
    }
}
