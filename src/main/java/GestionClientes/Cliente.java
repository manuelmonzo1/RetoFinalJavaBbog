package GestionClientes;

import java.util.Scanner;

public class Cliente extends Persona{

    Scanner scanner = new Scanner(System.in); //


     private String[] productos;

     //private Productos[] productoss;  //tipo y numero de producto


    public Cliente(String[] productos,String nombre,String apellido,String cedula) {
        super(nombre,apellido,cedula);
        this.productos = productos;
    }

    public Cliente(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

//    public Cliente() {
//        super();
//    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public void crearCliente(){
        String nombre,apellidos,cedula;
        System.out.println("Digite Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Digite Apellido: ");
        apellidos = scanner.nextLine();
        System.out.println("Digite cedula: ");
        cedula = scanner.nextLine();
    }



//    public Productos[] prod(){
//        Productos cdt = new Productos(1,"CDT");
//        Productos ahorrosCdt = new Productos(2,"AHORROS CDT");
//        Productos cuenta = new Productos(3,"CUENTA");
//
//        Productos[] pds = {cdt, ahorrosCdt, cuenta};
//
//        return pds;
//    }
}
// {"CDT","CUENTA DE AHORROS","CUENTA CORRIENTE"}