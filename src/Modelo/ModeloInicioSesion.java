package Modelo;

import Vistas.VistaInicioSesion;

public class ModeloInicioSesion {
    VistaInicioSesion vistaInicioSesion;
    private String Usuario;
    private String Contrasenia;
    private int tipoUsuario;

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
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
