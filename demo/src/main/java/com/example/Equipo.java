package com.example;

import java.util.Scanner;
import java.util.Vector;

/**
 * Clase que representa un equipo ciclista en una carrera.
 * Administra la colección de ciclistas y calcula el tiempo acumulado grupal.
 */
public class Equipo {
    // Atributos privados
    private String nombre;
    private static double totalTiempo; // Atributo estático para la suma de los tiempos de carrera en minutos
    private String pais;
    private Vector<Ciclista> listaCiclistas; // Colección de ciclistas que conforman el equipo

    /**
     * Constructor de la clase Equipo.
     * 
     * @param nombre Nombre del equipo.
     * @param pais País de origen del equipo.
     */
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0; // Inicialización del acumulador estático
        this.listaCiclistas = new Vector<Ciclista>();
    }

    // Métodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static double getTotalTiempo() {
        return totalTiempo;
    }

    public static void setTotalTiempo(double nuevoTotalTiempo) {
        totalTiempo = nuevoTotalTiempo;
    }

    public Vector<Ciclista> getListaCiclistas() {
        return listaCiclistas;
    }

    /**
     * Añade un nuevo ciclista (o cualquier subclase suya) a la lista del equipo.
     * 
     * @param ciclista Objeto de tipo Ciclista a ingresar.
     */
    public void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    /**
     * Recorre la lista de ciclistas del equipo e imprime el nombre de cada uno.
     */
    public void listarEquipo() {
        System.out.println("=== LISTADO DE CICLISTAS DEL EQUIPO: " + nombre + " ===");
        if (listaCiclistas.isEmpty()) {
            System.out.println("El equipo no tiene ciclistas registrados.");
            return;
        }
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.elementAt(i);
            System.out.println("- " + c.getNombre() + " (Dorsal: " + c.getIdentificador() + ")");
        }
    }

    /**
     * Calcula la suma de los tiempos acumulados de carrera de todos los ciclistas
     * y actualiza el atributo estático totalTiempo.
     */
    public void calcularTotalTiempo() {
        totalTiempo = 0;
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.elementAt(i);
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    /**
     * Busca un ciclista dentro del equipo por su identificador numérico.
     * Si lo encuentra, imprime toda su información detallada aplicando polimorfismo.
     * 
     * @param identificador Número identificador (dorsal) del ciclista a buscar.
     */
    public void buscarCiclista(int identificador) {
        boolean encontrado = false;
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = listaCiclistas.elementAt(i);
            if (c.getIdentificador() == identificador) {
                System.out.println("\n>>> Ciclista encontrado con identificador " + identificador + ":");
                c.imprimir(); // Llamada polimórfica al método imprimir()
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\n>>> El ciclista con identificador " + identificador + " NO pertenece a este equipo.");
        }
    }

    /**
     * Versión interactiva para buscar un ciclista solicitando el identificador por consola.
     */
    public void buscarCiclista() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el identificador del ciclista a buscar: ");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            buscarCiclista(id);
        } else {
            System.out.println("Identificador inválido.");
        }
    }

    /**
     * Imprime en consola los datos generales del equipo:
     * nombre, país y el tiempo total acumulado.
     */
    public void imprimir() {
        System.out.println("==========================================");
        System.out.println("DATOS DEL EQUIPO");
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Total tiempo acumulado del equipo: " + totalTiempo + " minutos");
        System.out.println("Número de ciclistas: " + listaCiclistas.size());
        System.out.println("==========================================");
    }
}
