import java.time.LocalDate;

public class Producto {
    //Atributos
    protected boolean disponible;

    //Constructor

    public Producto(boolean disponible) {
        this.disponible = false;
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }



}
