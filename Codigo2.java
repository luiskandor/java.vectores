package Java;

public class Codigo2 {
    private String marc;
    private String mod;
    private int year;

    // Constructor
    public Codigo2(String marca, String modelo, int año) {
        this.marc = marca;
        this.mod = modelo;
        this.year = año;
    }

    // Método para arrancar el automóvil
    public void arrancado() {
        System.out.println("El " + marc + " " + mod + " del año " + year + " está arrancado.");
    }

    // Método para frenar el automóvil
    public void frenado() {
        System.out.println("El " + marc + " " + mod + " del año " + year + " está frenado.");
    }

    // Método para mostrar información del automóvil
    public void info() {
        System.out.println("Marca: " + marc + ", Modelo: " + mod + ", Año: " + year);
    }

    // Método principal
    public static void main(String[] args) {
        Codigo2 carro = new Codigo2("Lamborghini", "Veneno Roadster", 2014);
        

        carro.arrancado();
        carro.frenado();
        carro.info();

       
    }
}
