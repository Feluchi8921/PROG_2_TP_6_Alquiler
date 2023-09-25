import java.time.LocalDate;

public class ItemAlquiler {
    //Atributos
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    protected boolean disponible;

    //Constructor

    public ItemAlquiler(LocalDate fechaInicio, LocalDate fechaFin, boolean disponible) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.disponible = false;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
