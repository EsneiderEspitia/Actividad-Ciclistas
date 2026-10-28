# Actividad-Ciclistas

Actividad planteada en clase sobre los ciclistas - Programación II (UNIAJC).
Carlos Espita
Angel Cuenu
Kevin Garcia

---

## Solución Taller Carrera Ciclística

Implementación en **Java** del modelado orientado a objetos para la gestión de equipos y ciclistas con especialidades (Velocista, Escalador, Contrarrelojista) aplicando **Abstracción**, **Herencia**, **Polimorfismo** y **Encapsulamiento**.

### Estructura de Clases

1. **`Ciclista` (Clase Abstracta):**
   - Atributos privados: `identificador` (int), `nombre` (String), `tiempoAcumulado` (int, inicializado en 0).
   - Método abstracto: `protected abstract String imprimirTipo()`.
   - Métodos protegidos: getters, setters e `imprimir()`.

2. **`Velocista` (Subclase de Ciclista):**
   - Atributos privados: `potenciaPromedio` (double, en vatios), `velocidadPromedio` (double, sprint en Km/h).
   - Constructor con invocación a `super(identificador, nombre)`.
   - Sobrescritura de `imprimirTipo()` retornando `"Es un velocista"` y de `imprimir()`.

3. **`Escalador` (Subclase de Ciclista):**
   - Atributos privados: `aceleracionPromedio` (float, en m/s²), `gradoRampa` (float, en grados).
   - Constructor con invocación a `super(identificador, nombre)`.
   - Sobrescritura de `imprimirTipo()` retornando `"Es un escalador"` y de `imprimir()`.

4. **`Contrarrelojista` (Subclase de Ciclista):**
   - Atributo privado: `velocidadMaxima` (double, en km/h).
   - Constructor con invocación a `super(identificador, nombre)`.
   - Sobrescritura de `imprimirTipo()` retornando `"Es un contrarrelojista"` y de `imprimir()`.

5. **`Equipo`:**
   - Atributos privados: `nombre` (String), `totalTiempo` (double estático), `pais` (String), `listaCiclistas` (Vector de Ciclistas).
   - Métodos: `anadirCiclista()`, `listarEquipo()`, `calcularTotalTiempo()`, `buscarCiclista()`, `imprimir()`.

6. **`PruebaCarreraCiclistica`:**
   - Clase ejecutable (`main`) que prueba y valida todas las funcionalidades requeridas.

---

### Compilación y Ejecución

```bash
# Compilar todas las clases
javac carreraciclistica/*.java

# Ejecutar el programa de prueba
java carreraciclistica.PruebaCarreraCiclistica
```
