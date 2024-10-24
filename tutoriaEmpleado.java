
import java.util.Scanner;

public class tutoriaEmpleado {
    String nombre, apellido, cargo;
    int id;
    Scanner sc=new Scanner(System.in);
    
    public void registroDatos(){
        System.out.println("Registre el nombre del empleado");
        nombre=sc.next();
        System.out.println("Registre el apellido del empleado");
        apellido=sc.next();
        System.out.println("Registre el cargo del empleado");
        cargo=sc.next();
        System.out.println("Registre el id del empleado");
        id=sc.nextInt();
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Cargo: "+cargo);
        System.out.println("ID: "+id);
    }
}