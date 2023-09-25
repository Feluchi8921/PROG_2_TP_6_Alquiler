import java.time.LocalDate;

public class Automovil extends ItemAlquiler{
    //Atributos
    private String marca;
    private int kms;
    private String patente;
    private String motor;

    //Constructor

    public Automovil(LocalDate fechaInicio, LocalDate fechaFin, boolean disponible, String marca, int kms, String patente, String motor) {
        super(fechaInicio, fechaFin, disponible);
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        this.motor=motor;
    }

    //Metodos getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    //Automovil disponible

    @Override
    public boolean isDisponible() {
        return this.disponible;
    }
}
