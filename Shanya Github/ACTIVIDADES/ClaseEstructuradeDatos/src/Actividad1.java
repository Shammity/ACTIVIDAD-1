import java.util.ArrayList;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(8);
        nums.add(12);
        nums.add(3);
        nums.add(4);
        nums.add(7);
        nums.add(10);
        nums.add(1);

        System.out.println("Elementos del ArrayList:");
        for (Integer num : nums) {
            System.out.println(num);
        }

        int sumaTotal = 0;
        int contadorPares = 0;
        for (Integer num : nums) {
            sumaTotal += num;
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Suma total:" + sumaTotal);
        System.out.println("Cantidad de números pares:" + contadorPares);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número a buscar:");
        int numeroBuscar = scanner.nextInt();

        if (nums.contains(numeroBuscar)) {
            System.out.println("El número" + numeroBuscar + "Está en la lista.");
        } else {
            System.out.println("El número" + numeroBuscar + "No está en la lista.");
        }
        scanner.close();
    }
}
