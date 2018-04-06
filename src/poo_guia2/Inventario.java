
package poo_guia2;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author LVS
 */
public class Inventario {
    private ArrayList<Producto> productos;
    Scanner input= new Scanner(System.in);

    public Inventario(){
        productos= new ArrayList<>();
    }
    
    public void agregarProducto(){
        Producto producto= new Producto();
        productos.add(producto);
        
        System.out.println("Ingrese el nombre del producto:");
        producto.setNombreProducto(input.nextLine());
        
        System.out.println("Ingrese la cantidad de producto a agregar: ");
        producto.setCantidadProducto(input.nextInt());
        
        System.out.println("Ingrese el costo del producto");
        producto.setCostoProducto(input.nextDouble());
        
    }
    
    public void cargarProducto(){
        int cantidad;
        String nombreProducto;
        System.out.println("Ingrese el nombre del producto a agregarle: ");
        nombreProducto=input.nextLine();
        
        for(Producto producto: productos){
            if(nombreProducto.equals(producto.getNombreProducto())){
                System.out.println("Ingrese la cantidad de producto a agregar: ");
                cantidad= input.nextInt();
                producto.cargarProducto(cantidad);
            }else{
                System.out.println("El producto buscado no existe");
            }
        }
    }
    
    public void descargarProducto(){
        int cantidad;
        String nombreProducto;
        System.out.println("Ingrese el nombre del producto a quitarle: ");
        nombreProducto=input.nextLine();
        
        for(Producto producto: productos){
            if(nombreProducto.equals(producto.getNombreProducto())){
                System.out.println("Ingrese la cantidad de producto a quitar: ");
                cantidad= input.nextInt();
                producto.descargarProducto(cantidad);
            }else{
                System.out.println("El producto buscado no existe");
            }
        }
    }
    
    public void eliminarProducto(){
        String nombreProducto;
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        nombreProducto=input.nextLine();
        
        for(Producto producto: productos){
            if(nombreProducto.equals(producto.getNombreProducto())){
                producto=null;
            }else{
                System.out.println("El producto que usted busca no existe o ya ha sido eliminado");
            }
        }
    }
    
    public void descartarProducto(){
        String nombreProducto;
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        nombreProducto=input.nextLine();
        
        for(Producto producto: productos){
            if(nombreProducto.equals(producto.getNombreProducto())){
                producto.setHabilitado(false);
            }else{
                System.out.println("El producto que usted busca no existe o ya ha sido eliminado");
            }
        }
    }
    
    public void modificarProducto(){
        int opcion=0;
        String nombreProducto;
        System.out.println("Ingrese el nombre del producto a modificar: ");
        nombreProducto= input.nextLine();
        
        for(Producto producto:productos){
            if(nombreProducto.equalsIgnoreCase(producto.getNombreProducto())){
                System.out.println("Que desea modificar?: ");
                System.out.println("1.Nombre");
                System.out.println("2.Cantidad");
                System.out.println("3.Precio");
                System.out.println("4.Salir");
                
                while(opcion!=4){
                    opcion= input.nextInt();
                    switch(opcion){
                        case 1:
                            String nuevoNombre;
                            System.out.println("Ingrese el nuevo nombre del producto: ");
                            nuevoNombre= input.nextLine();
                            producto.setNombreProducto(nuevoNombre);
                            break;
                        case 2:
                            int nuevaCantidad;
                            System.out.println("Ingrese la nueva cantidad del producto: ");
                            nuevaCantidad= input.nextInt();
                            if(nuevaCantidad<0)
                                nuevaCantidad=0;
                            producto.setCantidadProducto(nuevaCantidad);
                            break;
                        case 3:
                            double nuevoPrecio;
                            System.out.println("Ingrese el nuevo precio: ");
                            nuevoPrecio= input.nextDouble();
                            if(nuevoPrecio<0){
                                nuevoPrecio=0;
                            }
                            producto.setCostoProducto(nuevoPrecio);
                            break;
                        case 4:
                            System.out.println("Se ha salido con exito");
                            break;
                        default:
                            System.out.println("No se ingreso una opcion correcta");
                    }
                }
            }
        }
    }
}
