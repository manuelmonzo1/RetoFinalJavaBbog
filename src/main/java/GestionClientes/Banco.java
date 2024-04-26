package GestionClientes;

public class Banco {

    private String nombreBanco;
    private String[] productos;


    public Banco(String nombreBanco, String[] productos) {
        this.nombreBanco = nombreBanco;
        this.productos = productos;

    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String[] getProductos() {
        return productos;
    }


    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }



}
