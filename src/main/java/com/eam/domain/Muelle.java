package com.eam.domain;

public class Muelle {

    String nombre;
    String tipoMuelle;
    boolean ocupado;

    
    /**
     * 
     */
    public void cargar(){

    }

    public Muelle(String nombre, String tipoMuelle, boolean ocupado) {
        this.nombre = nombre;
        this.tipoMuelle = tipoMuelle;
        this.ocupado = ocupado;
    }

    public Muelle() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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
