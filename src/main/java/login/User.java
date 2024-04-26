package login;
/*
 * @(#) Login.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class User {
    private String nickname;
    private String password;

    int intento;

    public User(String nickname, String password, int intento) {
        this.nickname = nickname;
        this.password = password;
        this.intento=intento;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
