package com.example;

/**
 * Subclase concreta que representa a un ciclista especialista en pruebas contra el reloj (Contrarrelojista).
 * Hereda de la clase abstracta Ciclista.
 */
public class Contrarrelojista extends Ciclista {
    // Atributo privado específico del Contrarrelojista
    private double velocidadMaxima; // en km/h

    /**
     * Constructor de la clase Contrarrelojista.
     * Invoca al constructor de la clase padre (Ciclista) mediante super().
     * 
     * @param identificador Identificador numérico del ciclista.
     * @param nombre Nombre del contrarrelojista.
     * @param velocidadMaxima Velocidad máxima alcanzada en prueba llana (km/h).
     */
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos getters y setters (protegidos)

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Implementación del método abstracto de la clase padre.
     * Retorna la especialidad del ciclista.
     */
    @Override
    protected String imprimirTipo() {
        return "Es un contrarrelojista";
    }

    /**
     * Sobrescribe el método imprimir() mostrando los atributos heredados
     * y los propios de la especialidad contrarrelojista.
     */
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Tipo: " + imprimirTipo());
    }
}
