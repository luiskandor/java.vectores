
import java.util.Scanner;

public class ejercicioclase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros= new int [4];
        for (int i=0; i<4; i++) {
            System.out.println("Ingrese 20 numeros enteros...");
            numeros[i] = sc.nextInt();
        }
        int pares=0;
        int impares=0;
        int sumaPar=0;
        int sumaImpar=0;
        for (int numero:numeros) {
            if (numero % 2 == 0) {
                pares++;
                sumaPar += numero;
            } else {
                impares++;
                sumaImpar += numero;
            }

        }
        double promedio=sumaPar/pares;
        double promedioimpares=sumaImpar/impares;
        System.out.println("Hay "+pares+ " numeros pares");
        System.out.println("Hay "+impares+ " numeros impares");
        System.out.println("El promedio de los pares es de: "+promedio);
        System.out.println("El promedio de los impares es de: "+promedioimpares);
    }
}
