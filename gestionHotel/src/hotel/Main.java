package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        GestionClientes gestor = new GestionClientes(clientes);

        gestor.incluirCliente(new Cliente(1,"Manuel","Fernández Delgado", LocalDate.parse("1990-05-15"),18900,"mfd@gmail.com","111222333"));
        gestor.incluirCliente(new Cliente(2,"Jordi","Sánchez López", LocalDate.parse("1994-11-17"),20266,"jsl@gmail.com","444555666"));
        gestor.incluirCliente(new Cliente(3,"María","González Ortiz", LocalDate.parse("1969-09-02"),19200,"mgo@gmail.com","777888999"));
        gestor.incluirCliente(new Cliente(4,"Samuel","Tórres Pertíñez", LocalDate.parse("1990-12-25"),23952,"stp@gmail.com","999888777"));
        gestor.incluirCliente(new Cliente(5,"Isabel","Dominguez Ruíz", LocalDate.parse("2001-07-19"),12022,"idr@gmail.com","666555444"));

        gestor.listarClientes();
    }
}
