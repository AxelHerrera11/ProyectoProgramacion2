package Modelo;

import Vistas.PanelClientes;

public class ModeloClientes {
    PanelClientes vistaClientes;
    private String nombreCliente;
    private String telefono_Cliente;
    private String nit_cliente;

    public ModeloClientes() {
    }

    public ModeloClientes(PanelClientes vistaClientes) {
        this.vistaClientes = vistaClientes;
    }

    public PanelClientes getVistaClientes() {
        return vistaClientes;
    }

    public void setVistaClientes(PanelClientes vistaClientes) {
        this.vistaClientes = vistaClientes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono_Cliente() {
        return telefono_Cliente;
    }

    public void setTelefono_Cliente(String telefono_Cliente) {
        this.telefono_Cliente = telefono_Cliente;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }
    
    
}
