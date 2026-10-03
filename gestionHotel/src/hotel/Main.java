package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        GestionClientes gestor = new GestionClientes(clientes);

        gestor.añadirCliente(new Cliente(1,"Manuel","Fernández Delgado", LocalDate.parse("1990-05-15"),18900,"mfd@gmail.com","111222333"));
        gestor.añadirCliente(new Cliente(2,"Jordi","Sánchez López", LocalDate.parse("1994-11-17"),20266,"jsl@gmail.com","444555666"));
        gestor.añadirCliente(new Cliente(3,"María","González Ortiz", LocalDate.parse("1969-09-02"),19200,"mgo@gmail.com","777888999"));
        gestor.añadirCliente(new Cliente(4,"Samuel","Tórres Pertíñez", LocalDate.parse("1990-12-25"),23952,"stp@gmail.com","999888777"));
        gestor.añadirCliente(new Cliente(5,"Isabel","Dominguez Ruíz", LocalDate.parse("2001-07-19"),12022,"idr@gmail.com","666555444"));
        gestor.listarClientes();

        ArrayList<Hotel> hoteles = new ArrayList<>();
        GestionHoteles gestor2 = new GestionHoteles(hoteles);

        gestor2.añadirHotel(new Hotel(1,"NHBarcelona","Avenida Zaragonza, 56",34900,"nhb@gmail.com","222111555",5));
        gestor2.añadirHotel(new Hotel(2,"NHMadrid","Avenida de Murcia, 234",45687,"nhm@gmail.com","333222444",4));
        gestor2.añadirHotel(new Hotel(3,"NHValencia","Avenida de Aragón, 23",33234,"nhv@gmail.com","666555777",3));
        gestor2.añadirHotel(new Hotel(4,"NHSevilla","Avenida Andalucía, 45",55677,"nhs@gmail.com","888444555",2));
        gestor2.añadirHotel(new Hotel(5,"NHLeon","Avenida Huesca, 4",22341,"nhl@gmail.com","111333666",1));
        gestor2.listarHoteles();
    }
}
