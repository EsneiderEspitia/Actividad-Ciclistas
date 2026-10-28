package com.example;

/**
 * Clase abstracta que representa a un ciclista genérico en una carrera ciclística.
 * Contiene los atributos comunes y el método abstracto imprimirTipo() que deben
 * implementar las subclases según su especialidad.
 */
public abstract class Ciclista {
    // Atributos privados
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0; // Tiempo acumulado de carrera en minutos, inicializado en cero

    /**
     * Constructor de la clase abstracta Ciclista.
     * 
     * @param identificador Identificador único del ciclista (número de dorsal).
     * @param nombre Nombre completo del ciclista.
     */
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    /**
     * Método abstracto que devuelve el tipo o especialidad del ciclista.
     * Debe ser implementado obligatoriamente por cada subclase concreta.
     * 
     * @return Cadena que describe el tipo de ciclista.
     */
    protected abstract String imprimirTipo();

    // Métodos getters y setters (métodos protegidos según especificación)

    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    /**
     * Muestra en consola los datos generales del ciclista.
     * Puede ser invocado por las subclases mediante super.imprimir().
     */
    protected void imprimir() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempoAcumulado + " minutos");
    }
}
