package hotel;

public class Hotel {

    //Declaración de Variables
    private int idHotel;
    private String nombre;
    private String direccion;
    private int codigoPostal;
    private String email;
    private String telefono;
    private int estrellas;

    //Constructor
    public Hotel(int idHotel, String nombre, String direccion, int codigoPostal, String email, String telefono, int estrellas) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.telefono = telefono;
        this.estrellas = estrellas;
    }

    //Getters and Setters
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    //toString
    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", estrellas=" + estrellas +
                '}';
    }
}
