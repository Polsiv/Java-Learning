public class Puma extends Mamifero implements Corredor,Cazador{
    public Puma(){
        this.setNombreComun("Puma");
        this.setGenero("Puma");
        this.setEspecie("Concolor");
        this.setPeso(80);
        this.setProcedencia("Peru");
        this.setTiempoGestacion(90);

    }

    @Override
    public void cazar() {
        System.out.println("El puma suele cazar mamiferos mas pequeños que el, sin embargo es muy habil y fuerte");
    }

    @Override
    public void correr() {
        System.out.println("El puma corre a una velocidad de entre 60 y 80 km/h");

    }
    public String info(){
        return "Nombre Comun: " + this.getNombreComun() + "\n" + "Genero: " +  this.getGenero() + "\n"  + "Especie: " + this.getEspecie() + "\n" + "Peso: " + this.getPeso() + "\n" + "Procedencia: " + this.getProcedencia() + "\n" + "Envergadura Alas: " + this.getTiempoGestacion();
    }
}
