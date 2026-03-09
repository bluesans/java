package milo;
import java.util.*;

public class ololll {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;
        int nota = 0;
        int total = 0;

        System.out.print("cuantos alumnos quiere?: ");
        cantidad = scanner.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("ingrese la nota del alumno numero " + i + ": ");
            nota = scanner.nextInt();

            if (nota == 10) {
                System.out.println("Excelente");
            } else if (nota >= 8) {
                System.out.println("Muy Bueno");
            } else if (nota >= 6) {
                System.out.println("Bueno");
            } else if (nota >= 4) {
                System.out.println("Regular");
            } else {
                System.out.println("Insuficiente");
            }

            total = total + nota;
        }

        float promedio = (float) total / cantidad;
        System.out.printf("el promedio es: %.2f%n", promedio);
        scanner.close();
    }
}