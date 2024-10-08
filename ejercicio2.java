import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] alturas = new double[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Ingresa la altura " +(i + 1)+ ": ");
                alturas[i] = scanner.nextDouble();
            }

            double sumaAlturas = 0;
            for (double altura : alturas) {
                sumaAlturas += altura;
            }
            double promedio = sumaAlturas / 5;

            System.out.println("\nAlturas mayores al promedio:");
            for (double altura : alturas) {
                if (altura > promedio) {
                    System.out.println(altura);
                }
            }

            System.out.println("\nAlturas menores al promedio:");
            for (double altura : alturas) {
                if (altura < promedio) {
                    System.out.println(altura);
                }
            }

            System.out.println("\nPromedio de alturas: " + promedio);
        }
    }
}