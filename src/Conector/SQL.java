package Conector;

public class SQL {
    private final String CONSULTA_CLIENTES = "SELECT * FROM cliente";
    private final String CONSULTA_CLIENTES_CODIGO = "SELECT * FROM cliente WHERE codigo_cliente = ?";
    private final String INSERTAR_CLIENTE = "INSERT INTO Cliente (nombre_cliente, telefono_cliente, nit_cliente) VALUES(?,?,?)";
    private final String CONSULTA_USUARIO = "SELECT nombre_usuario, contrasenia_usuario, tipo_usuario FROM Usuario WHERE nombre_usuario = ?";
    private final String AGREGAR_PRODUCTO = "INSERT INTO Producto (nombre_producto, cantidad, precio_normal, precio_promocional, codigo_de_barra, imagen_producto, categoria_producto) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String MOSTRAR_CATEGORIA_PRODUCTO = "SELECT nombre_categoria_producto FROM Categoria_Producto";
    
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

    public String getAGREGAR_PRODUCTO() {
        return AGREGAR_PRODUCTO;
    }

    public String getMOSTRAR_CATEGORIA_PRODUCTO() {
        return MOSTRAR_CATEGORIA_PRODUCTO;
    }
    
    
}
