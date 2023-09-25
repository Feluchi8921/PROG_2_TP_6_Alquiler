import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Creo un auto
        Automovil auto1 = new Automovil(true, "Ford",100000, "AC122GH", "Diesel");

        //Creo un cliente
        Cliente cliente1 = new Cliente("Feli", "12345678");

        //Alquiler
        Alquiler alquiler1 = new Alquiler(auto1,cliente1, LocalDate.of(2023,02,11), LocalDate.of(2023,03,20));

        //Sistema de alquiler
        SistemAlquiler sistema = new SistemAlquiler();

        //Agrego al sistema de alquiler
        sistema.addAlquiler(alquiler1);
        sistema.addCliente(cliente1);
        sistema.addProducto(auto1);

        //Imprimo
        System.out.println("Los clientes con alquileres vencidos son: ");
        System.out.println(sistema.isVencido().toString());
    }
}