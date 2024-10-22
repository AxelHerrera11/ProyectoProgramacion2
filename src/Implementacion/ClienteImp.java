package Implementacion;

import Conector.DBConnection;
import Conector.SQL;
import Interfaces.ICliente;
import Modelo.ModeloClientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteImp implements ICliente {

    DBConnection conector = new DBConnection();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insertarCliente(ModeloClientes modelo) {
        boolean resultado = true;
        conector.conectar();
        ps = conector.preparar(sql.getINSERTAR_CLIENTE());
        try {
            ps.setString(1, modelo.getNombreCliente());
            ps.setString(2, modelo.getTelefono_Cliente());
            ps.setString(2, modelo.getNit_cliente());
            resultado = ps.execute();
        } catch (SQLException e) {
            conector.mensaje(e.getMessage(), "Error en la insercion", 0);
        }
        return resultado;
    }

}
