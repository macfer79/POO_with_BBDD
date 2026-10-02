package hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1,"Manuel","Fernández Delgado", LocalDate.parse("1990-05-15"),18900,"mfd@gmail.com","111222333");
        Cliente cliente2 = new Cliente(2,"Jordi","Sánchez López", LocalDate.parse("1994-11-17"),20266,"jsl@gmail.com","444555666");
        Cliente cliente3 = new Cliente(3,"María","González Ortiz", LocalDate.parse("1969-09-02"),19200,"mgo@gmail.com","777888999");
        Cliente cliente4 = new Cliente(4,"Samuel","Tórres Pertíñez", LocalDate.parse("1990-12-25"),23952,"stp@gmail.com","999888777");
        Cliente cliente5 = new Cliente(5,"Isabel","Dominguez Ruíz", LocalDate.parse("2001-07-19"),12022,"idr@gmail.com","666555444");

        Hotel hotel1 = new Hotel(1,"NHBarcelona","Avenida Zaragona,6", 23700,"nhb@hotel.com","111555333",5);
        Hotel hotel2 = new Hotel(2,"NHMadrid","Avenida Aragón,33", 52366,"nhm@hotel.com","222444999",3);


    }
}
