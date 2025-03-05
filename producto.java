public class producto {

    private String nombre;
    private double precio;

    public producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

    }

    public void mostrarProducto(){

        System.out.println("Nombre: " + this.nombre);
    }

    public void mostrarPrecio(){
        System.out.println("Precio: " + this.precio);
    }

    //metodo para mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: "  + this.precio);
  
    }
  }
