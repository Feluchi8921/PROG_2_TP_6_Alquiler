import java.time.LocalDate;

public class Pelicula extends Producto{
    //Atributos
    private String titulo;
    private String genero;
    private String infoFilm;
    private int cantCopias;

    //Constructor

    public Pelicula(boolean disponible, String titulo, String genero, String infoFilm, int cantCopia) {
        super(disponible);
        this.titulo=titulo;
        this.genero=genero;
        this.infoFilm = infoFilm;
        this.cantCopias = cantCopias;
    }

    //Metodos getters and setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

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

    //Para imprimir
    public String toString(){
        return "Titulo: "+ getTitulo()+" - Genero: "+getGenero()+" - Informacion filmografica: "+getInfoFilm()+" - Cantidad de copias"+getCantCopias();
    }
}
