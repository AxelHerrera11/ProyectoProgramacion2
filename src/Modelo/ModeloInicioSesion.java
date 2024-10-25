package Modelo;

import Vistas.VistaInicioSesion;

public class ModeloInicioSesion {

    VistaInicioSesion vistaInicioSesion;
    private String usuario;
    private String contrasenia;
    private static int tipoUsuario;
    private static String usuarioEncontrado;
    private static String contraseniaEncontrada;
    private static int idUsuarioEncontrado;

    public ModeloInicioSesion() {
    }

    public ModeloInicioSesion(VistaInicioSesion vistaInicioSesion) {
        this.vistaInicioSesion = vistaInicioSesion;
    }

    public VistaInicioSesion getVistaInicioSesion() {
        return vistaInicioSesion;
    }

    public void setVistaInicioSesion(VistaInicioSesion vistaInicioSesion) {
        this.vistaInicioSesion = vistaInicioSesion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuarioEncontrado() {
        return usuarioEncontrado;
    }

    public void setUsuarioEncontrado(String usuarioEncontrado) {
        this.usuarioEncontrado = usuarioEncontrado;
    }

    public String getContraseniaEncontrada() {
        return contraseniaEncontrada;
    }

    public void setContraseniaEncontrada(String contraseniaEncontrada) {
        this.contraseniaEncontrada = contraseniaEncontrada;
    }

    public int getIdUsuarioEncontrado() {
        return idUsuarioEncontrado;
    }

    public void setIdUsuarioEncontrado(int idUsuarioEncontrado) {
        this.idUsuarioEncontrado = idUsuarioEncontrado;
    }
    
}
