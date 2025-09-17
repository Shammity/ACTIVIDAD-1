import java.util.Arrays;
import java.util.Random;

public class Semana5_Busquedas {

        public static void main(String[] args) {

            int[] arreglo = generarArregloAleatorio(20);
            System.out.println("Arreglo original: " + Arrays.toString(arreglo));

            Arrays.sort(arreglo);
            System.out.println("Arreglo ordenado para búsqueda binaria: " + Arrays.toString(arreglo));

            int valorAEncontrar = arreglo[5]; // Un valor que sí está en el arreglo.
            int valorNoEncontrado = 999;     // Un valor que no debería estar.

            System.out.println("\n--- Búsqueda Lineal ---");
            busquedaLineal(arreglo, valorAEncontrar);
            busquedaLineal(arreglo, valorNoEncontrado);

            System.out.println("\n--- Búsqueda Binaria ---");
            busquedaBinaria(arreglo, valorAEncontrar);
            busquedaBinaria(arreglo, valorNoEncontrado);
        }

        public static int[] generarArregloAleatorio(int size) {
            Random rand = new Random();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(1000) + 1;
            }
            return arr;
        }

        public static void busquedaLineal(int[] arr, int valor) {
            int comparaciones = 0;
            boolean encontrado = false;

            for (int i = 0; i < arr.length; i++) {
                comparaciones++;
                if (arr[i] == valor) {
                    encontrado = true;
                    System.out.println("Busca el valor" + valor + ":Encontrado en el índice" + i + "Comparaciones:" + comparaciones);
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Busca el valor" + valor + ":No encontrado. Comparaciones:" + comparaciones);
            }
        }

        public static void busquedaBinaria(int[] arr, int valor) {
            int comparaciones = 0;
            int bajo = 0;
            int alto = arr.length - 1;
            boolean encontrado = false;

            while (bajo <= alto) {
                comparaciones++;
                int medio = bajo + (alto - bajo) / 2;

                if (arr[medio] == valor) {
                    encontrado = true;
                    System.out.println("Busca el valor" + valor + ":Encontrado en el índice" + medio + "Comparaciones: " + comparaciones);
                    break;
                } else if (arr[medio] < valor) {
                    bajo = medio + 1;
                } else {
                    alto = medio - 1;
                }
            }
            if (!encontrado) {
                System.out.println("Busca el valor" + valor + ":No encontrado. Comparaciones:" + comparaciones);
            }
        }
    }
