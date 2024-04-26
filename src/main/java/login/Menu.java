package login;
/*
 * @(#) Menu.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Menu {

    public void validarIntentos(String username,String password, int intento){
        Login login=new Login();
        int intentos=intento;
        while (intentos<=2){
            String msj = login.validarCredenciales(username, password);
            if(msj.equals("Alguna de las credenciales es incorrecta")){
                intentos++;
            }else {
                System.out.println("Login exitoso");
                break;
            }

            if(intentos==2){
                System.out.println("Usuario bloqueado");
                break;
            }
        }
    }
}
