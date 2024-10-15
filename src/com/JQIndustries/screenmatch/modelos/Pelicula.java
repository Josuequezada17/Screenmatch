package com.JQIndustries.screenmatch.modelos;

import com.JQIndustries.sceenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
