package Java;

public class Codigo1 {

    private String nom;
    private String mat;
    private int ed;

    // Constructor que inicializa los atributos nom, mat y ed.
    public Codigo1(String nom, String mat, int ed) {
        this.nom = nom;
        this.mat = mat;
        this.ed = ed;
    }

    // Método para simular que el maestro está enseñando la materia.
    public void ensenar() {
        System.out.println(nom + " está enseñando " + mat);
    }

    // Método para simular la llamada de lista.
    public void lista() {
        System.out.println(nom + " está pasando lista en " + mat);
    }

    // Método para simular que el maestro está evaluando la materia.
    public void evaluar() {
        System.out.println(nom + " está evaluando " + mat);
    }

        // Método principal
        public static void main(String[] args) {
            Codigo1 profesor1 = new Codigo1("Alejandro Alzate", "Sociales", 10);
            
    
            profesor1.ensenar();
            profesor1.evaluar();
    
           
        }
    }


