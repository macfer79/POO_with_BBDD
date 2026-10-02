package hotel;

public class Habitacion {

    //Declaración de Variables
    private int idHabitacion;
    private int numero;
    private int planta;
    private String tipo;
    private String categoria;
    private double precioPorNoche;
    private boolean disponible;

    //Constructor
    public Habitacion(int idHabitacion, int numero, int planta, String tipo, String categoria, double precioPorNoche, boolean disponible) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.planta = planta;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    //Getters and Setters
    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //toString
    @Override
    public String toString() {
        return STR."Habitacion{idHabitacion=\{idHabitacion}, numero=\{numero}, planta=\{planta}, tipo='\{tipo}', categoria='\{categoria}', precioPorNoche=\{precioPorNoche}, disponible=\{disponible}}";
    }
}
