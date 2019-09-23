/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ASUS-PC
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column
    private String nombre;
    
    @Column
    private String user;
    
    @Column
    private String clave;

    public Usuario() {
    
    }
    
    public Usuario(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.user = usuario;
        this.clave = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return user;
    }

    public void setUsuario(String usuario) {
        this.user = usuario;
    }

    public String getContrasena() {
        return clave;
    }

    public void setContrasena(String contrasena) {
        this.clave = contrasena;
    }
    
    
    
    
    
}
