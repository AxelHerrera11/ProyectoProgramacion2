/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Implementacion.RegistroImp;
import Modelo.ModeloRegistroUsuario;

/**
 *
 * @author jhosu
 */
public class ControladorRegistroUsuario {
    ModeloRegistroUsuario modelo;
    RegistroImp implementacion = new RegistroImp();
    
    public ControladorRegistroUsuario(ModeloRegistroUsuario modelo){
        this.modelo = modelo;
        
    }
    
    
    
}
