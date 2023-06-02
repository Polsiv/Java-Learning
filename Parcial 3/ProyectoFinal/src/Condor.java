public class Condor extends Ave implements Volador{
    public Condor(){
        this.setNombreComun("Condor");
        this.setGenero("Vultur");
        this.setEspecie("Gryphus");
        this.setPeso(14);
        this.setProcedencia("Chile");
        this.setEnvergaduraAlas(2.83);
    }

    @Override
    public void volar() {
        System.out.println("El condor es un ave de gran tamaño que vuela de una manera impresionante");
    }
    public String info(){
        return "Nombre Comun: " + this.getNombreComun() + "\n" + "Genero: " +  this.getGenero() + "\n"  + "Especie: " + this.getEspecie() + "\n" + "Peso: " + this.getPeso() + "\n" + "Procedencia: " + this.getProcedencia() + "\n" + "Envergadura Alas: " + this.getEnvergaduraAlas();
    }
}
