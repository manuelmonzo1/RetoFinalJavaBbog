package GestionClientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    Banco banco;

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void ejecutarMenu() {
        do {
            System.out.println("*****************" +
                    "**************");
            System.out.println("********Menu*******");
            System.out.println("Opcion 1: registro cliente nuevo");
            System.out.println("Opcion 2: actualizacion cliente actual");
            System.out.println("Opcion 3: buscar cliente por cedula");
            System.out.println("Opcion 4: ver lista de clientes");
            System.out.println("Opcion 5: Salir");
            System.out.println("***********************");
            System.out.print("Selecionar una Opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                        crearCliente();
                    break;
                case 2:
                    actualizarCliente(consultarClliente());
                    break;
                case 3:
                    mostrarCliente(consultarClliente());
                    break;
                case 4:
                    verListaClientes();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error escoja una de las opciones indicadas: ");
            }
        } while (opcion != 5);
    }

    public void crearCliente() {
        String nombre, apellido, cedula;
        String[] productos = banco.getProductos();
        System.out.println("Digitar Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Digitar Apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Digitar Cedula: ");
        cedula = scanner.nextLine();
       // productos = seleccionarProductos();
        Cliente cliente = new Cliente(nombre, apellido, cedula);
        //Cliente cliente = new Cliente(productos, nombre, apellido, cedula);
        clientes.add(cliente);
        System.out.println("Cliente Creado con Exito");
    }

//    public String[] seleccionarProductos(){
//        String[] productos = new String[3];
//        System.out.println("Digite su primer producto: ");
//        productos[0] = scanner.nextLine();
//        System.out.println("Digite su segundo producto: ");
//        productos[1] = scanner.nextLine();  hacer menu de productos 
//
//        return productos;
//    }


    public void mostrarCliente(int indice) {
        System.out.println("Cliente numero: " + (indice + 1));
        System.out.println("Nombre: " + clientes.get(indice).getNombre());
        System.out.println("Apellido: " + clientes.get(indice).getApellido());
        System.out.println("Cedula: " + clientes.get(indice).getCedula());
        for (int j = 0; j < clientes.get(indice).getProductos().length; j++) {
            System.out.println("producto " + (j + 1) + " " + clientes.get(indice).getProductos()[j]);
        }
    }

    public int consultarClliente() {
        String cedula;
        int indice = -1;
        System.out.println("Digite Numero de cedula: ");
        cedula = scanner.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                indice = i;
            }
        }
        if (indice == -1) {
            System.out.println("cliente no encontrado: ");
        }
        return indice;
    }

    public void verListaClientes() {
        System.out.println("Los clientes son las siguientes: ");
        for (int i = 0; i < clientes.size(); i++) {
            mostrarCliente(i);
            System.out.println("**********************");
        }
    }

    public void actualizarCliente(int indice) {
        String nombre, apellido, cedula;
        String[] productos = new String[2];
        int dato;
        do {
            System.out.println("Por favor indique el dato que quiere modificar: ");
            System.out.println("Opcion 1: Nombre");
            System.out.println("Opcion 2: Apellido");
            System.out.println("Opcion 3: Cedula");
            System.out.println("Opcion 4: Productos");
            System.out.println("Opcion 5: Salir");
            System.out.println("***********************");
            System.out.print("Selecionar una Opcion: ");
            dato = Integer.parseInt(scanner.nextLine());
            switch (dato) {
                case 1:
                    System.out.println("Digite el nombre: ");
                    nombre = scanner.nextLine();
                    clientes.get(indice).setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Digite el Apellido: ");
                    apellido = scanner.nextLine();
                    clientes.get(indice).setApellido(apellido);
                    break;
                case 3:
                    System.out.println("Digite cedula: ");
                    cedula = scanner.nextLine();
                    clientes.get(indice).setCedula(cedula);
                    break;
                case 4:
                    System.out.println("Digite su primer producto: ");
                    productos[0] = scanner.nextLine();
                    System.out.println("Digite su segundo producto: ");
                    productos[1] = scanner.nextLine();
                    clientes.get(indice).setProductos(productos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error escoja una de las opciones indicadas: ");
            }
        }
        while (dato != 5);
    }
}


