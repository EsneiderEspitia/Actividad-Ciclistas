package com.example;

/**
 * Clase de prueba ejecutable que contiene el método main.
 * Demuestra la creación del equipo, la instanciación de las subclases de ciclistas,
 * la adición a la colección, el cálculo de tiempos y las operaciones de búsqueda y listado.
 */
public class PruebaCarreraCiclistica {

    public static void main(String[] args) {
        System.out.println("*************************************************************");
        System.out.println("      SISTEMA DE GESTIÓN DE CARRERA CICLÍSTICA (UNIAJC)      ");
        System.out.println("*************************************************************\n");

        // 1. Instanciación del equipo
        Equipo equipo = new Equipo("Team Colombia Élite", "Colombia");

        // 2. Creación de ciclistas de cada especialidad
        Velocista velocista = new Velocista(101, "Fernando Gaviria", 385.5, 68.2);
        Escalador escalador = new Escalador(102, "Nairo Quintana", 3.4f, 19.5f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(103, "Rigoberto Urán", 62.8);

        // 3. Asignación de tiempo acumulado de carrera a cada ciclista (en minutos)
        velocista.setTiempoAcumulado(135);
        escalador.setTiempoAcumulado(120);
        contrarrelojista.setTiempoAcumulado(128);

        // 4. Agregar los ciclistas al equipo
        equipo.anadirCiclista(velocista);
        equipo.anadirCiclista(escalador);
        equipo.anadirCiclista(contrarrelojista);

        // 5. Calcular la suma total de tiempos del equipo
        equipo.calcularTotalTiempo();

        // 6. Imprimir los datos del equipo
        equipo.imprimir();

        System.out.println();

        // 7. Listar los integrantes del equipo
        equipo.listarEquipo();

        System.out.println();

        // 8. Búsqueda de ciclistas por identificador
        System.out.println("=== PRUEBA DE BÚSQUEDA DE CICLISTAS ===");
        // Búsqueda exitosa
        equipo.buscarCiclista(102);

        // Búsqueda fallida (no existe)
        equipo.buscarCiclista(999);

        System.out.println();

        // 9. Demostración de Polimorfismo: Impresión detallada de cada ciclista
        System.out.println("=== DETALLE COMPLETO DE CADA CICLISTA (POLIMORFISMO) ===");
        for (Ciclista c : equipo.getListaCiclistas()) {
            System.out.println("------------------------------------------");
            c.imprimir(); // Cada subclase ejecuta su propia versión especializada
        }
        System.out.println("------------------------------------------");
    }
}
