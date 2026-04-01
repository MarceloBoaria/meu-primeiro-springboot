package br.com.boaria.meu_primeiro_springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String usarname;

    @Column(nullable = false)
    private String password;

    public Usuario() {}

    public Usuario(String usarname, String password) {
        this.usarname = usarname;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsarname() {
        return usarname;
    }

    public String getPassword() {
        return password;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
