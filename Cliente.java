
/**
 * Write a description of class Clientes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente
{
    String identificacion;
    String nombre;
    String sucursal;
    double compra1;
    double compra2;
    double compra3;
    
    public Cliente(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sucursal = sucursal; 
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
    }
    
    public double promedio(){
        return (compra1+compra2+compra3)/3;
    }
}
