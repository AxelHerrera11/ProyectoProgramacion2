/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vistas.PanelRegistrarUsuario;

/**
 *
 * @author jhosu
 */
public class ModeloRegistroUsuario {

    PanelRegistrarUsuario vistaRegistro;
    private String nombreUsuario;
    private String ContraseniaUsuario;
    private int categoriaUsuario;
    private static String usuarioEncontrado;
    private static String contraseniaEncontrada;

    public ModeloRegistroUsuario() {
    }

    public ModeloRegistroUsuario(PanelRegistrarUsuario vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public PanelRegistrarUsuario getVistaRegistro() {
        return vistaRegistro;
    }

    public void setVistaRegistro(PanelRegistrarUsuario vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseniaUsuario() {
        return ContraseniaUsuario;
    }

    public void setContraseniaUsuario(String ContraseniaUsuario) {
        this.ContraseniaUsuario = ContraseniaUsuario;
    }

    public int getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(int categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
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

   
}
