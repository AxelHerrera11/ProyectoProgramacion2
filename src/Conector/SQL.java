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
    private final String CONSULTA_MOSTRAR_USUARIOS = "SELECT nombre_usuario, contrasenia_usuario FROM Usuario WHERE nombre_usuario = ?";
    private final String CONSULTA_ELIMINAR_USUARIO = "DELETE FROM Usuario WHERE nombre_usuario = ?;";
    private final String ACTUALIZAR_PRODUCTO = "UPDATE Producto SET nombre_producto = ?, cantidad = ?, precio_normal = ?, precio_promocional = ?, categoria_producto = ? WHERE id_producto = ?";
    private final String ELIMINAR_PRODUCTO = "DELETE FROM Producto WHERE id_producto = ?";
    private final String ACTUALIZAR_IMAGEN_PRODUCTO = "UPDATE Producto SET imagen_producto = ? WHERE id_producto = ?";
    private final String ELIMINAR_IMAGEN_PRODUCTO = "UPDATE Producto SET imagen_producto = NULL WHERE id_producto = ?";
    private final String INSERTAR_GESTION_INVENTARIO = "INSERT INTO Gestion_Inventario (tipo_gestion, cantidad_gestion, fecha_gestion, hora_gestion, usuario_gestion, producto_gestion) VALUES(?, ?, ?, ?, ?, ?)";
    private final String CONSULTAR_GESTION_INVENTARIO = "FROM \n" +
                                                        "    Gestion_Inventario gi\n" +
                                                        "JOIN \n" +
                                                        "    Tipo_Gestion tg ON gi.tipo_gestion = tg.id_tipo_gestion\n" +
                                                        "JOIN \n" +
                                                        "    Usuario u ON gi.usuario_gestion = u.id_usuario\n" +
                                                        "JOIN \n" +
                                                        "    Producto p ON gi.producto_gestion = p.id_producto";
    private final String CONSULTA_VENTAS = "SELECT \n" +
                                            "    v.id_venta,\n" +
                                            "    u.nombre_usuario,\n" +
                                            "    tp.nombre_tipo_pago,\n" +
                                            "    c.nombre_cliente,\n" +
                                            "    v.total_venta,\n" +
                                            "    v.iva,\n" +
                                            "    v.fecha_venta,\n" +
                                            "    v.hora_venta\n" +
                                            "FROM \n" +
                                            "    Venta v\n" +
                                            "JOIN \n" +
                                            "    Usuario u ON v.vendedor = u.id_usuario\n" +
                                            "JOIN \n" +
                                            "    Tipo_Pago tp ON v.tipo_pago = tp.id_tipo_pago\n" +
                                            "JOIN \n" +
                                            "    Cliente c ON v.cliente = c.id_cliente;";
    
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

    public String getCONSULTA_MOSTRAR_USUARIOS() {
        return CONSULTA_MOSTRAR_USUARIOS;
    }

    public String getCONSULTA_ELIMINAR_USUARIO() {
        return CONSULTA_ELIMINAR_USUARIO;
    }

    public String getACTUALIZAR_PRODUCTO() {
        return ACTUALIZAR_PRODUCTO;
    }

    public String getELIMINAR_PRODUCTO() {
        return ELIMINAR_PRODUCTO;
    }

    public String getACTUALIZAR_IMAGEN_PRODUCTO() {
        return ACTUALIZAR_IMAGEN_PRODUCTO;
    }

    public String getELIMINAR_IMAGEN_PRODUCTO() {
        return ELIMINAR_IMAGEN_PRODUCTO;
    }

    public String getINSERTAR_GESTION_INVENTARIO() {
        return INSERTAR_GESTION_INVENTARIO;
    }

    public String getCONSULTAR_GESTION_INVENTARIO() {
        return CONSULTAR_GESTION_INVENTARIO;
    }

    public String getCONSULTA_VENTAS() {
        return CONSULTA_VENTAS;
    }
    
}
