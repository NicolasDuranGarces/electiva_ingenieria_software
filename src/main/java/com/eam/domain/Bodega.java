package com.eam.domain;

import java.util.ArrayList;


public class Bodega {

    String nombre;
    String direccion;
    ArrayList<Muelle> listaMuelles;
    Ciudad ciudad;

    public Bodega(String nombre, String direccion, ArrayList<Muelle> listaMuelles, Ciudad ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaMuelles = listaMuelles;
        this.ciudad = ciudad;
    }

    public Bodega() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Muelle> getListaMuelles() {
        return listaMuelles;
    }

    public void setListaMuelles(ArrayList<Muelle> listaMuelles) {
        this.listaMuelles = listaMuelles;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    
}
