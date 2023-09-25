import java.time.LocalDate;
import java.util.ArrayList;

public class SistemAlquiler {
    //Atributos
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Alquiler>alquileres = new ArrayList<>();

    //Constructor
    public SistemAlquiler(){
        this.alquileres = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    //Agregar alquiler
    public void addAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    //Agregar cliente
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    //Agregar Producto
    public void addProducto(Producto producto){
        productos.add(producto);
    }
    //Se puede alquilar
    public boolean sePuedeAlquilar(Producto producto){
        return producto.isDisponible()==true;
    }

    //Clientes con Alquileres vencidos
    public ArrayList<Cliente> isVencido(){
        ArrayList<Cliente> clientesVencido=new ArrayList<>();

        for (Alquiler a: alquileres) {
            if(a.isVencido()){
                clientesVencido.add(a.getCliente());
            }
        }
        return clientesVencido;
    }

    public String toString(ArrayList<Cliente> clientesVencidos){
        for (Cliente c: clientesVencidos){
           c.toString();
        }
        return null;
    }
}
