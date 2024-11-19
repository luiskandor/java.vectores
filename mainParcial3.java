import java.util.Scanner;
public class mainParcial3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do { 
                System.out.println("Menu de opciones");
                System.out.println("1. Agregar estudiante");
                System.out.println("2. Mostrar todos los estudiantes ");
                System.out.println("3. Buscar Estudiante por Nombre");
                System.out.println("4. Calcular el promedio general");
                System.out.println("5. Salir");
                opcion=sc.nextInt();
                gestionEstudiante nuevo=new gestionEstudiante(2);
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese el nombre del estudiante");
                        String nombre=sc.next();
                        System.out.println("Ingrese la edad del estudiante");
                        String edad=sc.next();
                        System.out.println("Ingrese el promedio del estudiante");
                        double promedio=sc.nextDouble();
                        estudiantes esta=new estudiantes(nombre, edad, promedio);
                        nuevo.agregarEstudiante(esta);
                        System.out.println("Estudiante registrado con exito");
                    }
                    case 2 -> {
                        nuevo.mostrarEstudiantes();
                    }
                    case 3 -> {
                        nuevo.buscarPorNombre();
                    }
                    case 4 -> {
                        nuevo.calcularPromedioGeneral(opcion);
                    }
                    default -> System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (opcion!=5);
        }
    }  
}
