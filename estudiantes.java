public class estudiantes {
    String nombre, edad; double promedio;
    public estudiantes(String nombre, String edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "estudiantes [nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + "]";
    }
}
