
package poo_guia2;
import java.util.ArrayList;
import java.util.Scanner;


public class Registro {
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Administrador> administradores;
    Scanner input= new Scanner(System.in);

    public Registro() {
        proveedores= new ArrayList<>();
        administradores= new ArrayList<>();
    }
    
    public void agregarProveedor(){
        Proveedor proveedor= new Proveedor();
        proveedores.add(proveedor);
        
        System.out.println("Ingrese el nombre del proveedor: ");
        proveedor.setNombreProveedor(input.nextLine());
        
        System.out.println("Ingrese el telefono del proveedor: ");
        proveedor.setTelefonoProveedor(input.nextLine());
    }
    
    public void agregarAdministrador(){
        Administrador administrador= new Administrador();
        administradores.add(administrador);
        
        System.out.println("Ingrese el nombre del administrador: ");
        administrador.setNombreAdministrador(input.nextLine());
        
        System.out.println("Ingrese el telefono del administrador: ");
        administrador.setTelefonoAdministrador(input.nextLine());
    }
    
    public void mostrarProveedores(){
        for(Proveedor p:proveedores){
            System.out.println(p.toString());
        }
    }
    
    public void mostrarAdministradores(){
        for(Administrador a:administradores){
            System.out.println(a.toString());
        }
    }
}
