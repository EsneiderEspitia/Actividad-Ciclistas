package com.example;

/**
 * Subclase concreta que representa a un ciclista especialista en montaña (Escalador).
 * Hereda de la clase abstracta Ciclista.
 */
public class Escalador extends Ciclista {
    // Atributos privados específicos del Escalador
    private float aceleracionPromedio; // en subida (m/s2)
    private float gradoRampa; // grado de rampa soportada (grados)

    /**
     * Constructor de la clase Escalador.
     * Invoca al constructor de la clase padre (Ciclista) mediante super().
     * 
     * @param identificador Identificador numérico del ciclista.
     * @param nombre Nombre del escalador.
     * @param aceleracionPromedio Aceleración media en subida (m/s^2).
     * @param gradoRampa Grado de inclinación de la rampa que soporta (grados).
     */
    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    // Métodos getters y setters (protegidos)

    protected float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected float getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    /**
     * Implementación del método abstracto de la clase padre.
     * Retorna la especialidad del ciclista.
     */
    @Override
    protected String imprimirTipo() {
        return "Es un escalador";
    }

    /**
     * Sobrescribe el método imprimir() mostrando los atributos heredados
     * y los propios de la especialidad escalador.
     */
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio en subida: " + aceleracionPromedio + " m/s^2");
        System.out.println("Grado de rampa soportada: " + gradoRampa + " grados");
        System.out.println("Tipo: " + imprimirTipo());
    }
}
