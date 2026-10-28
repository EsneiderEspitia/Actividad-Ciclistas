package com.example;

/**
 * Subclase concreta que representa a un ciclista especialista en velocidad (Velocista).
 * Hereda de la clase abstracta Ciclista.
 */
public class Velocista extends Ciclista {
    // Atributos privados específicos del Velocista
    private double potenciaPromedio; // en vatios
    private double velocidadPromedio; // en sprint (Km/h)

    /**
     * Constructor de la clase Velocista.
     * Invoca al constructor de la clase padre (Ciclista) mediante super().
     * 
     * @param identificador Identificador numérico del ciclista.
     * @param nombre Nombre del velocista.
     * @param potenciaPromedio Potencia media en vatios (W).
     * @param velocidadPromedio Velocidad media en el sprint final (Km/h).
     */
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    // Métodos getters y setters (protegidos)

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    /**
     * Implementación del método abstracto de la clase padre.
     * Retorna la especialidad del ciclista.
     */
    @Override
    protected String imprimirTipo() {
        return "Es un velocista";
    }

    /**
     * Sobrescribe el método imprimir() mostrando los atributos heredados
     * y los propios de la especialidad velocista.
     */
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio en sprint: " + velocidadPromedio + " Km/h");
        System.out.println("Tipo: " + imprimirTipo());
    }
}
