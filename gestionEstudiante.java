import java.util.Scanner;

public class gestionEstudiante {
    //Este es el constructor.
    private final estudiantes[]estudiante; int cantidadActual;
    public gestionEstudiante(estudiantes[] estudiante, int cantidadActual, int capacidad_Max) {
        this.estudiante = estudiante;
        this.cantidadActual = cantidadActual;
    }
    //Este public nos permite definir la capacidad maxima de estudiantes.
    public gestionEstudiante(int capacidad_Max){
        estudiante=new estudiantes[capacidad_Max];
        cantidadActual=0;
    }
    //este metodo agrega estudiantes a la lista.
    public void agregarEstudiante(estudiantes estudiantes){
        if(cantidadActual<estudiante.length){
            cantidadActual++;
        }else{
            System.out.println("La capacidad máxima de estudiantes ha sido alcanzada.");
        }
    }
    //Este metodo nos arroja todos los datos del estudiante.
    public void mostrarEstudiantes(){
        for(int i=0; i<cantidadActual; i++){
            System.out.println("El nombre del estudiante es: "+estudiante[i].getNombre());
            System.out.println("Promedio: "+estudiante[i].getPromedio());
            System.out.println("La edad es "+estudiante[i].getEdad());
        }
    }
    //Este metodo nos ayuda a ver si el estudiante esta en la lista.
    public void buscarPorNombre(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del estudiante a buscar: ");
            String nombre=sc.nextLine();
            boolean encontrado=false;
            for(int i=0; i<cantidadActual; i++){
                if(estudiante[i].getNombre().equals(nombre)){
                    System.out.println("El estudiante SI existe en la base de datos");
                    encontrado=true;
                    break;
                }else{
                    System.out.println("El estudiante NO existe en la base de datos.");
                }
            }
            if(!encontrado){
                System.out.println("El estudiante no se encuentra en la lista.");
            }
        }
    }
    // Este metodo es el encargado de calcular el promedio de los estudiantes.
    public void calcularPromedioGeneral(double promedioGeneral){
        double sumaPromedios=0;
        for(int i=0; i<cantidadActual; i++){
            sumaPromedios+=estudiante[i].getPromedio();
        }
        promedioGeneral=sumaPromedios/cantidadActual;
        System.out.println("El promedio general de los estudiantes es: "+promedioGeneral);
    }
}
