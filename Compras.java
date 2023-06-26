import java.util.Scanner;

/**
 * Write a description of class Compras here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compras
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String identificacion, nombre, sucursal;
        double compra1, compra2, compra3, promedio = 0;
        int numClientes=0, opc=0;
    
        Cliente[] losClientes = new Cliente[50];
        
        
        
        while(opc != 3){
            System.out.println("\nDigite la opción que prefiera: ");
            System.out.println("1. Agregar Cliente.");
            System.out.println("2. Calcular promedio.");
            System.out.println("3. Salir.");
            opc = scn.nextInt();
            
            if(opc==1){
                System.out.println("\nDigite la identificacion del cliente");
                identificacion = scn.next();
                System.out.println("Digite el nombre del cliente");
                nombre = scn.next();
                System.out.println("Digite la sucursal del cliente");
                sucursal = scn.next();
                System.out.println("Digite la compra uno del clientes");
                compra1 = scn.nextInt();
                System.out.println("Digite la compra dos del clientes");
                compra2 = scn.nextInt();
                System.out.println("Digite la compra tres del clientes");
                compra3 = scn.nextInt();
                Cliente unCliente = new Cliente(identificacion, nombre, sucursal, compra1, compra2, compra3);
                losClientes[numClientes] = unCliente;
                numClientes++;
            }
            else if(opc==2){
                for(int i = 0; i < numClientes; i++){
                    promedio = promedio + losClientes[i].promedio();
                }
                System.out.println("\nEl promedio de compras es: " + promedio/ numClientes);
            }
            else if(opc==3){
                System.out.println("\nGracias por usar el programa!");
            }
            else{
                System.out.println("\nIngrese una opción válida.");
            }
        }
    }
}
