package com.JQIndustries.sceenmatch.calculos;

import com.JQIndustries.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private double tiempoTotal;

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public double getTiempoTotal() {
        return this.tiempoTotal;
    }
}
