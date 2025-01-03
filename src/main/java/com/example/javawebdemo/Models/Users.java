package com.example.javawebdemo.Models;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "users") // This tells Hibernate to name the table "users"
public class Users {
    @Id // This tells Hibernate to make this column the primary key
    @Column(name = "id") // This tells Hibernate to name the column "id"
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This tells Hibernate to auto increment the column
    private Long id;

    @Column(name = "username") // This tells Hibernate to name the column "username"
    private String username;

    @Column(name = "password") // This tells Hibernate to name the column "password"
    private String password;

    @Column(name = "email") // This tells Hibernate to name the column "email"
    private String email;


    public Users(String username, String password, String email, Long id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
    }

    public Users() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
