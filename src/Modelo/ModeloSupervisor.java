package Modelo;

import Vistas.VistaSupervisor;

public class ModeloSupervisor {

    VistaSupervisor vistaSupervisor;

    public ModeloSupervisor() {
    }

    public ModeloSupervisor(VistaSupervisor vistaSupervisor) {
        this.vistaSupervisor = vistaSupervisor;
    }

    public VistaSupervisor getVistaSupervisor() {
        return vistaSupervisor;
    }

    public void setVistaSupervisor(VistaSupervisor vistaSupervisor) {
        this.vistaSupervisor = vistaSupervisor;
    }

}
