import java.util.ArrayList;

public class VideoClub {
    //Atributo
    private ArrayList<ItemAlquiler> items = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    //Constructor

    public VideoClub() {

    }

    //Metodo asignar item
    public boolean asignarItem(ItemAlquiler item){
        if(item.isDisponible()==true){
            item.setDisponible(false);
            return true;
        }
        return false;
    }
}
