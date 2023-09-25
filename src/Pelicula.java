import java.time.LocalDate;

public class Pelicula extends ItemAlquiler{
    //Atributos
    private String infoFilm;
    private int cantCopias;

    //Constructor

    public Pelicula(LocalDate fechaInicio, LocalDate fechaFin, boolean disponible, String infoFilm, int cantCopia) {
        super(fechaInicio, fechaFin, disponible);
        this.infoFilm = infoFilm;
        this.cantCopias = cantCopias;
    }

    //Metodos getters and setters

    public String getInfoFilm() {
        return infoFilm;
    }

    public void setInfoFilm(String infoFilm) {
        this.infoFilm = infoFilm;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }


    //Se puede alquilar
    @Override
    public boolean isDisponible(){
        return this.cantCopias>0;
    }
}
