import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PruebaPractica1 {

        public static void main(String[] args) {
            System.out.println("==================================================");
            System.out.println("            PRUEBAS DE PRACTICA 1                 ");
            System.out.println("==================================================\n");

            // -----------------------------------------------------------------
            // PRUEBA 1: Método separa
            // -----------------------------------------------------------------
            System.out.println("--- 1. Prueba de separa(unicos, repetidos) ---");

            Set<String> setA = new HashSet<>(Arrays.asList("Ana", "Carlos", "Beatriz", "David"));
            Set<String> setB = new HashSet<>(Arrays.asList("Beatriz", "Elena", "Carlos", "Fernando"));

            System.out.println("Entrada Set 1: " + setA);
            System.out.println("Entrada Set 2: " + setB);

            // Se invoca el método (modifica los conjuntos que se le pasan)
            Practica1.separa(setA, setB);

            System.out.println("Salida Únicos:    "+ setA);
            System.out.println("Salida Repetidos: " + setB);
            System.out.println();


            // -----------------------------------------------------------------
            // PRUEBA 2: Método filtra
            // -----------------------------------------------------------------
            System.out.println("--- 2. Prueba de filtra(Iterator<Integer>) ---");

            // Ejemplo 1: mezcla de ceros, números con múltiplos y repetidos
            List<Integer> listaNúmeros1 = Arrays.asList(0, 3, 6, 2, 8, 9, 5, 10, -4, 3);
            System.out.println("Colección de entrada 1: " + listaNúmeros1);
            Set<Integer> resultadoFiltra1 = Practica1.filtra(listaNúmeros1.iterator());
            System.out.println("Resultado filtrado 1:   " + resultadoFiltra1);


            // Ejemplo 2: orden invertido (llega un múltiplo antes que el divisor)
            List<Integer> listaNúmeros2 = Arrays.asList(12, 4, 2);
            System.out.println("\nColección de entrada 2: " + listaNúmeros2);
            Set<Integer> resultadoFiltra2 = Practica1.filtra(listaNúmeros2.iterator());
            System.out.println("Resultado filtrado 2:   " + resultadoFiltra2);
            System.out.println();


            // -----------------------------------------------------------------
            // PRUEBA 3: Método repetidos
            // -----------------------------------------------------------------
            System.out.println("--- 3. Prueba de repetidos(Collection<Set<String>>) ---");

            Set<String> grupo1 = new HashSet<>(Arrays.asList("rojo", "verde", "azul"));
            Set<String> grupo2 = new HashSet<>(Arrays.asList("verde", "amarillo", "blanco"));
            Set<String> grupo3 = new HashSet<>(Arrays.asList("azul", "negro", "verde"));

            Collection<Set<String>> coleccionGrupos = Arrays.asList(grupo1, grupo2, grupo3);

            System.out.println("Grupo 1: " + grupo1);
            System.out.println("Grupo 2: " + grupo2);
            System.out.println("Grupo 3: " + grupo3);

            Set<String> elementosRepetidos = Practica1.repetidos(coleccionGrupos);
            System.out.println("Elementos que aparecen al menos en 2 grupos: " + elementosRepetidos);

            System.out.println();


            // -----------------------------------------------------------------
            // PRUEBA 4: Método interseccionImpares
            // -----------------------------------------------------------------
            System.out.println("--- 4. Prueba de interseccionImpares(Collection<Set<Integer>>) ---");

            Set<Integer> conjuntoNums1 = new HashSet<>(Arrays.asList(1, 3, 5, 8, 9, 10));
            Set<Integer> conjuntoNums2 = new HashSet<>(Arrays.asList(3, 5, 7, 9, 12));
            Set<Integer> conjuntoNums3 = new HashSet<>(Arrays.asList(3, 9, 11, 15));

            Collection<Set<Integer>> coleccionConjuntos = Arrays.asList(conjuntoNums1, conjuntoNums2, conjuntoNums3);

            System.out.println("Conjunto 1: " + conjuntoNums1);
            System.out.println("Conjunto 2: " + conjuntoNums2);
            System.out.println("Conjunto 3: " + conjuntoNums3);

            Set<Integer> imparesComunes = Practica1.interseccionImpares(coleccionConjuntos);
            System.out.println("Impares comunes a TODOS los conjuntos: " + imparesComunes);

            System.out.println("==================================================");
        }
}
