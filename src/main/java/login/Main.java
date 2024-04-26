package login;
/*
 * @(#) Main.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Main {
    public static void main(String[] args) {
        User user= new User("Harry potter","1234",1);
        Menu menu=new Menu();
        menu.validarIntentos(user.getNickname(), user.getPassword(), user.intento);



    }
}
