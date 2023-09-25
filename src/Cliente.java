import java.util.ArrayList;

public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private ArrayList<Automovil> automoviles;

    //Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.automoviles= new ArrayList<>();
    }

    //Metodos getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    
    //Auto dispoible
    public boolean isOcupado(Automovil automovil){
        for (Automovil a:automoviles) {
            if(automoviles.contains(automovil)){
                return true;
            }
        }
        return false;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
}
