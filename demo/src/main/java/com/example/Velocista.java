package com.example;

public class Velocista extends Ciclista {
    private double potenciaPromedio; // en vatios
    private double velocidadSprint;  // en Km/h

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadSprint() {
        return velocidadSprint;
    }

    public void setVelocidadSprint(double velocidadSprint) {
        this.velocidadSprint = velocidadSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
}