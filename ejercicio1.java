import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("¿Cuantos numeros vas a ingresar?(Enteros)");
            int n=sc.nextInt();
            System.out.println("Ingrese "+n+" numeros los cuales seran sumados");
            double numero=sc.nextDouble();
            for(int i=1; i<n; i++){
                numero+=sc.nextDouble();
            }
            System.out.println("La suma de todos los numeros ingresados es: "+numero);
        }
    }
}