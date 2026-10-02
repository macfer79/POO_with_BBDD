package hotel;

import java.time.LocalDate;

public class Cliente {

    //Declaración de Variables
    private int idCliente;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private int codigoPostal;
    private String email;
    private String telefono;

    //Constructor
    public Cliente(int idCliente, String nombre, String apellidos, LocalDate fechaNacimiento, int codigoPostal, String email, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.telefono = telefono;
    }

    //Getters and Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    //toString
    @Override
    public String toString() {
        return STR."Cliente{idCliente=\{idCliente}, nombre='\{nombre}', apellidos='\{apellidos}', fechaNacimiento=\{fechaNacimiento}, codigoPostal=\{codigoPostal}, email='\{email}', telefono='\{telefono}'}";
    }
}
