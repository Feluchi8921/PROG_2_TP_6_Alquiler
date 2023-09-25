import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
    //Atributos
    private Producto producto;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;


    //Constructor
    public Alquiler(Producto producto, Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente=cliente;
        this.producto=producto;
    }

    //Metodos getters and setters

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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isVencido(){
        LocalDate fechaActual = LocalDate.now();
        return (this.fechaFin.isBefore(fechaActual));
    }
}

