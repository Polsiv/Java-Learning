public class Titi extends Mamifero{
    public Titi(){
       this.setNombreComun("Titi");
       this.setGenero("Callicebus");
       this.setEspecie("Pallecens");
       this.setPeso(0.400);
       this.setProcedencia("Paraguay");
       this.setTiempoGestacion(183);
    }
    public String info(){
        return "Nombre Comun: " + this.getNombreComun() + "\n" + "Genero: " +  this.getGenero() + "\n"  + "Especie: " + this.getEspecie() + "\n" + "Peso: " + this.getPeso() + "\n" + "Procedencia: " + this.getProcedencia() + "\n" + "Tiempo Gestacion: " + this.getTiempoGestacion();
    }
}
