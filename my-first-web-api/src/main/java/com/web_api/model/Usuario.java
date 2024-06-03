package com.web_api.model;

public class Usuario {
    private long id;
    private String senha;
    private String login;
    public Usuario(){}
    public Usuario(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", senha='" + senha + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
