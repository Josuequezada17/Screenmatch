package com.JQIndustries.screenmatch.modelos;

public class Serie extends Titulo{

    int temporadas;
    int episodiosPorTemporada;
    double minutosPorEpisodio;

    public double getDuracionEnMinutos() {
        return (temporadas * episodiosPorTemporada * minutosPorEpisodio) ;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public double getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(double minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
