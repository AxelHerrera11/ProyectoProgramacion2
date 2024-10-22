package Interfaces;

import Modelo.ModeloInicioSesion;

public interface IInicioSesion {
    public ModeloInicioSesion consultarUsuario(String usuario, String contrasenia);
}
