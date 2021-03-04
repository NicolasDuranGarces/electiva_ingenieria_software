package com.eam.domain;
import java.util.ArrayList;
import java.util.Map;

import lombok.Data;

@Data
public class Bodega {

    String nombre;
    Map<String,ArrayList<Muelle>> muelles;
    String ciudad;

    public Bodega() {
    }

    public Bodega(String nombre, Map<String, ArrayList<Muelle>> muelles, String ciudad) {
        this.nombre = nombre;
        this.muelles = muelles;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, ArrayList<Muelle>> getMuelles() {
        return muelles;
    }

    public void setMuelles(Map<String, ArrayList<Muelle>> muelles) {
        this.muelles = muelles;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
