package com.JQIndustries.screenmatch.modelos;

public class Pelicula {

    String nombre = "";
    int fechaDeLanzamiento = 0;
    int duracionEnMinutos = 0;
    boolean incluidoEnElPlan = false;
    private double sumaDeEvaluaciones = 0.0;
    private int totalEvaluaciones = 0;

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la pelicula: " + this.nombre);
        System.out.println("Fecha de lanzamiento: " + this.fechaDeLanzamiento);
        System.out.println("Duracion en Minutos: " + this.duracionEnMinutos);
    };

    public void evaluaPelicula(double nota){
        this.sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calcularMedia(){

        return this.sumaDeEvaluaciones/this.totalEvaluaciones;
    }

    public int getTotalEvaluaciones(){
        return this.totalEvaluaciones;
    }

    public double getSumaDeEvaluaciones(){
        return this.sumaDeEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
}
