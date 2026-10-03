package hotel;

import java.util.ArrayList;

public class GestionHoteles {

    private final ArrayList<Hotel> hoteles;

    public GestionHoteles(ArrayList<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public void añadirHotel(Hotel hotel) {
        hoteles.add(hotel);
    }

    public void listarHoteles() {
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }
    }
}
