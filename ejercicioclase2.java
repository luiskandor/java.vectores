import java.util.Scanner;

public class ejercicioclase2 {
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

            int may=0;
            int men=0;
            System.out.println("\nAlturas mayores al promedio:");
            for (double altura : alturas) {
                if (altura > promedio) {
                    System.out.println(altura);
                    may++;
                    System.out.println("Hay "+may+" alturas mayores al promedio");
                }
            }

            System.out.println("\nAlturas menores al promedio:");
            for (double altura : alturas) {
                if (altura < promedio) {
                    System.out.println(altura);
                    men++;
                    System.out.println("Hay "+men+" alturas menores al promedio:");
                }
            }

            System.out.println("\nPromedio de alturas: " + promedio);
        }
    }
}