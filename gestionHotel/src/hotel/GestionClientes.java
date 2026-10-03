package hotel;

import java.util.ArrayList;

public class GestionClientes {

    private final ArrayList<Cliente> clientes;

    public GestionClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
