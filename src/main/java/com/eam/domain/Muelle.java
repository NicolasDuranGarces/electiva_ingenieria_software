package com.eam.domain;

import lombok.Data;

@Data
public class Muelle {

    int nombre;
    String tipoMuelle;
    boolean ocupado;

    
    /**
     * 
     */
    public void cargar(){

    }

    public Muelle() {
    }

    public Muelle(int nombre, String tipoMuelle, boolean ocupado) {
        this.nombre = nombre;
        this.tipoMuelle = tipoMuelle;
        this.ocupado = ocupado;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getTipoMuelle() {
        return tipoMuelle;
    }

    public void setTipoMuelle(String tipoMuelle) {
        this.tipoMuelle = tipoMuelle;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

}
