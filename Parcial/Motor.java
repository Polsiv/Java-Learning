public class Motor{

private String fabricante;
private int revoluciones;


//constructor
public Motor(String fabricante, int revoluciones){
this.fabricante = fabricante;
setRevoluciones(revoluciones);
    }

//Mostrar========================================================================


@Override
public String toString() {
    return " Fabricante=" + this.fabricante + ", Revoluciones=" + getRevoluciones();
}

//setters==========================================================================

public void setFabricante(String fab) {
    this.fabricante = fab;
}


public void setRevoluciones(int rev) {
    if (rev < 8400){
        System.err.println("Las revoluciones no pueden ser menoeres a 8400");
        this.revoluciones = 8400;

    } if (rev > 10500){
        System.err.println("Las revoluciones no puedens er mayores a 1500");
        this.revoluciones = 10500;
    } if (rev >= 8400 && rev <= 10500){
        this.revoluciones = rev;
    }
}

//getters============================================================================

public String getFabricante() {
    return fabricante;
    }

public int getRevoluciones() {
    return revoluciones;
    }
}