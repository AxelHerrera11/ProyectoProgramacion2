package Conector;

public class SQL {
    
    //CONSULTAS SQL
    private final String CONSULTA_CLIENTES = "SELECT * FROM Cliente";
    private final String CONSULTA_CLIENTES_CODIGO = "SELECT * FROM Cliente WHERE id_cliente = ?";
    private final String INSERTAR_CLIENTE = "INSERT INTO Cliente (nombre_cliente, telefono_cliente, nit_cliente) VALUES(?,?,?)";
    private final String CONSULTA_USUARIO = "SELECT id_usuario, nombre_usuario, contrasenia_usuario, tipo_usuario FROM Usuario WHERE nombre_usuario = ?";
    private final String AGREGAR_PRODUCTO = "INSERT INTO Producto (nombre_producto, cantidad, precio_normal, precio_promocional, codigo_de_barra, imagen_producto, categoria_producto, numero_codigo_barras) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private final String MOSTRAR_CATEGORIA_PRODUCTO = "SELECT nombre_categoria_producto FROM Categoria_Producto";
    private final String CONSULTA_NUMERO_CODIGO_BARRAS = "SELECT MAX(numero_codigo_barras) FROM Producto";
    private final String CONSULTA_PRODUCTO = "SELECT nombre_producto, cantidad, precio_normal, precio_promocional, codigo_de_barra, imagen_producto FROM Producto WHERE id_producto = ?";
    private final String CONSULTA_ACTUALIZAR_CLIENTE = "UPDATE Cliente SET nombre_cliente = ?, telefono_cliente = ? WHERE id_cliente = ?";
    private final String CONSULTA_ELMINAR_CLIENTE = "DELETE FROM Cliente where nit_cliente = ?";
    private final String CONSULTA_PRODUCTO_NO_CB = "SELECT id_producto, nombre_producto, cantidad, precio_normal, precio_promocional, imagen_producto FROM Producto WHERE numero_codigo_barras = ?";
    private final String CONSULTA_TIPO_PAGO = "SELECT nombre_tipo_pago FROM Tipo_Pago";
    private final String CONSULTA_CLIENTE_NIT = "SELECT * FROM Cliente WHERE nit_cliente = ?";
    private final String INSERTAR_VENTA = "INSERT INTO Venta (vendedor, tipo_pago, fecha_venta, hora_venta, total_venta, iva, cliente) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String CONSULTA_MOSTRAR_TIPO_USUARIO = "SELECT nombre_tipo_usuario FROM Tipo_Usuario";
    private final String CONSULTA_INSERTAR_USUARIO = "INSERT INTO Usuario (nombre_usuario, contrasenia_usuario, tipo_usuario) VALUES (?, ?, ?)";
    private final String CONSULTA_CANTIDAD_PRODUCTO = "SELECT cantidad FROM Producto WHERE id_producto = ?";
    private final String ACTUALIZAR_CAN_AL_RE_VENTA = "UPDATE Producto SET cantidad = ? WHERE id_producto = ?";
    private final String CONSULTA_ULTIMA_VENTA = "SELECT MAX(id_venta) FROM Venta";
    private final String INSERTAR_DETALLE_VENTA = "INSERT INTO Detalle_Venta (producto_dv, precio_venta, cantidad_dv, subtotal, venta) VALUES (?, ?, ?, ?, ?)";
   
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

    public String getCONSULTA_NUMERO_CODIGO_BARRAS() {
        return CONSULTA_NUMERO_CODIGO_BARRAS;
    }

    public String getCONSULTA_PRODUCTO() {
        return CONSULTA_PRODUCTO;
    }

    public String getCONSULTA_ACTUALIZAR_CLIENTE() {
        return CONSULTA_ACTUALIZAR_CLIENTE;
    }

    public String getCONSULTA_ELMINAR_CLIENTE() {
        return CONSULTA_ELMINAR_CLIENTE;
    }

    public String getCONSULTA_PRODUCTO_NO_CB() {
        return CONSULTA_PRODUCTO_NO_CB;
    }

    public String getCONSULTA_TIPO_PAGO() {
        return CONSULTA_TIPO_PAGO;
    }

    public String getCONSULTA_CLIENTE_NIT() {
        return CONSULTA_CLIENTE_NIT;
    }

    public String getINSERTAR_VENTA() {
        return INSERTAR_VENTA;
    }

    public String getCONSULTA_MOSTRAR_TIPO_USUARIO() {
        return CONSULTA_MOSTRAR_TIPO_USUARIO;
    }

    public String getCONSULTA_INSERTAR_USUARIO() {
        return CONSULTA_INSERTAR_USUARIO;
    }

    public String getCONSULTA_CANTIDAD_PRODUCTO() {
        return CONSULTA_CANTIDAD_PRODUCTO;
    }

    public String getACTUALIZAR_CAN_AL_RE_VENTA() {
        return ACTUALIZAR_CAN_AL_RE_VENTA;
    }

    public String getCONSULTA_ULTIMA_VENTA() {
        return CONSULTA_ULTIMA_VENTA;
    }

    public String getINSERTAR_DETALLE_VENTA() {
        return INSERTAR_DETALLE_VENTA;
    }
    
}
