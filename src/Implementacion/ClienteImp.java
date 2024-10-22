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

        return resultado;
    }

}
