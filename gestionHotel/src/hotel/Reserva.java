package hotel;

import java.util.Date;

public class Reserva {

    //Declaración de Variables
    private int idReserva;
    private Date fechaEntrada;
    private Date fechaSalida;
    private double precioTotal;
    private String estado;

    //Constructor
    public Reserva(int idReserva, Date fechaEntrada, Date fechaSalida, double precioTotal, String estado) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    //Getters and Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //toString
    @Override
    public String toString() {
        return STR."Reserva{idReserva=\{idReserva}, fechaEntrada=\{fechaEntrada}, fechaSalida=\{fechaSalida}, precioTotal=\{precioTotal}, estado='\{estado}'}";
    }
}
