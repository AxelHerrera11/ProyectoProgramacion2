package Conector;

public class SQL {
    private final String CONSULTA_CLIENTES = "SELECT * FROM cliente";
    private final String CONSULTA_CLIENTES_CODIGO = "SELECT * FROM cliente WHERE codigo_cliente = ?";
    private final String INSERTAR_CLIENTE = "INSERT INTO cliente (nombre_cliente, telefono_cliente, nit_cliente) VALUES(?,?,?)";
    private final String CONSULTA_USUARIO = "SELECT nombre_usuario, contrasenia_usuario, tipo_usuario FROM Usuario WHERE nombre_usuario = ?";

    public SQL() {
    }

    public String getCONSULTA_CLIENTES() {
        return CONSULTA_CLIENTES;
    }

    public String getCONSULTA_CLIENTES_CODIGO() {
        return CONSULTA_CLIENTES_CODIGO;
    }

    public String getINSERTAR_CLIENTE() {
        return INSERTAR_CLIENTE;
    }

    public String getCONSULTA_USUARIO() {
        return CONSULTA_USUARIO;
    }
    
    
}
