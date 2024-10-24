package Interfaces;

import Modelo.ModeloClientes;
import javax.swing.table.DefaultTableModel;

public interface ICliente {
    public boolean insertarCliente(ModeloClientes modelo);
    public boolean actualizarCliente(ModeloClientes modelo);
    public boolean eliminarCliente(String nit);
    public DefaultTableModel modeloClientes();
    public DefaultTableModel modeloCliente(int codigo_cliente);
    public ModeloClientes mostrarCliente(int codigo_cliente);
}
