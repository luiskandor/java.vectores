
public class producto {
    private int codigo;
    private String name;
    private double precio;

    public producto (int codigo, String name, double precio){
        this.codigo = codigo;
        this.name = name;
        this.precio = precio;
    }
    public producto(){
    }
    public int getCodigo() {
        return codigo;
    }
    public String getName() {
        return name;
        }
    public double getPrecio() {
        return precio;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double calcularTotal(int cantidad){
        return precio * cantidad;
    }
    public void descuento(double precio){
        double descuento=precio*0.10;
        System.out.println(descuento);
    }
}