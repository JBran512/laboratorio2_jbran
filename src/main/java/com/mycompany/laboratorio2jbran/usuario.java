/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2jbran;

/**
 *
 * @author Admin
 */
public class usuario {
    private String nombre;
    private String email;
    private String usuario;
    private String contraseña;
    private boolean es_admin;
    private boolean activo;
    
    public usuario (String nombre, String usuario, String email, String contraseña, boolean es_admin, boolean activo){
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.es_admin = es_admin;
        this.activo = activo;
    }
    
    public String getNombre() {return nombre;}
    public String getUsuario() {return usuario;}
    public String getEmail() {return email;}
    public String getContraseña() {return contraseña;}
    public boolean getEs_damin() {return es_admin;}
    public boolean getActivo() {return activo;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
    public void setActivo(boolean activo) {this.activo = activo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEmail (String email) {this.email = email;}
}
