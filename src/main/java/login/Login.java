package login;
/*
 * @(#) Login.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Login {
    private String usuarioRegistrado="Harry potter";
    private String clave="1234";

    public String validarCredenciales(String username, String password){
        if(username!=usuarioRegistrado || password!=clave){
            return  "Alguna de las credenciales es incorrecta";
        }else{
            return "login exitoso";
        }
    }

    public void setUsuarioRegistrado(String usuarioRegistrado) {
        this.usuarioRegistrado = usuarioRegistrado;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
