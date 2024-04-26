
/*
 * @(#) Arreglo.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Arreglo {

    public static void main(String[] args) {
        String[] nombres= new String[5];

        nombres[0]="Jorge";
        nombres[1]="Mayra";
        nombres[2]="Felix";
        nombres[3]="Gina";
        nombres[4]="Andres";

        for(int indice=0;indice< nombres.length;indice++){
            if(nombres[indice].equals("Gina")){
                System.out.println("el indice es: "+indice);
            }
        }
    }
}
