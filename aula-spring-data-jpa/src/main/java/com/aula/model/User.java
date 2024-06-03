package com.aula.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(length = 50, nullable = false) // permite até 50 caracter e não permite nulos
    private String name;

    @Column(length = 20, nullable = false) // permite até 50 caracter e não permite nulos
    private String username;

    @Column(length = 100, nullable = false) // permite até 50 caracter e não permite nulos
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
