import java.util.Random;

public class Semana4_Ordenamientos {
    public static void main(String[] args) {

        int[] nums = new int[100];
        Random rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100) + 1;
        }

        int[] copiaBurbuja = nums.clone();
        long tiempoInicioBurbuja = System.nanoTime();
        burbuja(copiaBurbuja);
        long tiempoFinBurbuja = System.nanoTime();
        System.out.println("Tiempo Burbuja:" + (tiempoFinBurbuja - tiempoInicioBurbuja) + " ns");

        int[] copiaSeleccion = nums.clone();
        long tiempoInicioSeleccion = System.nanoTime();
        seleccion(copiaSeleccion);
        long tiempoFinSeleccion = System.nanoTime();
        System.out.println("Tiempo Selección:" + (tiempoFinSeleccion - tiempoInicioSeleccion) + " ns");

        int[] copiaInsercion = nums.clone();
        long tiempoInicioInsercion = System.nanoTime();
        insercion(copiaInsercion);
        long tiempoFinInsercion = System.nanoTime();
        System.out.println("Tiempo Inserción:" + (tiempoFinInsercion - tiempoInicioInsercion) + " ns");
    }

    public static void burbuja(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void seleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }
}