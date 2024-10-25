/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.ModeloRegistroUsuario;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jhosu
 */
public interface IRegistro {
    
    public boolean guardarUsuario(ModeloRegistroUsuario modelo);
    public DefaultComboBoxModel mostrarTiposUsuarios();
    
}
