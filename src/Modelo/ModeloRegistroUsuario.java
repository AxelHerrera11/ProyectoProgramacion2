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

    
}
