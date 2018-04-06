
package poo_guia2;

public class Producto {
    private String nombreProducto;
    private int cantidadProducto;
    private double costoProducto;
    private boolean habilitado= true;

    public Producto() {
    }
    
    public Producto(String nombreProducto, int cantidadProducto, double costoProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.costoProducto = costoProducto;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    
    /**
     * Agrega la cantidad deseada de producto a la cantidad ya existente
     * @param cantidad 
     */
    public void cargarProducto(int cantidad){
        this.cantidadProducto+=cantidad;
    }
    
    /**
     * Quita la cantidad deseada a una cantidad de productos, si la cantidad que se quita es mayor a la cantidad que existe entonces
     * la cantidad sera igual a cero.
     * @param cantidad 
     */
    public void descargarProducto(int cantidad){
        this.cantidadProducto-=cantidad;
        if(this.cantidadProducto<0){
            this.cantidadProducto=0;
        }
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }
    
    
    
}
