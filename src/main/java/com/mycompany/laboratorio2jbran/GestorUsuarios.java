/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2jbran;
import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class GestorUsuarios {
    private static GestorUsuarios instancia;
    private ArrayList<usuario> listaUsuarios;
    private usuario usuarioActual;
    
    private GestorUsuarios(){
        listaUsuarios = new ArrayList<>();
        // Usuario admin
        listaUsuarios.add(new usuario("Jafet Bran", "Jbran", "jbran@gmail.com", "Umariano24", true, true));
        //Usuario interno
        listaUsuarios.add(new usuario("Douglas Garcia", "Dgarcia", "dgarcia@gmail.com", "Umariano24", false, true));
    }
    
    public static GestorUsuarios getInstancia(){
        if (instancia == null){
            instancia = new GestorUsuarios();
        }
        return instancia;
    }
    
    //Logica para crear usuario
    public boolean crearUsuario(String nombre, String usuario, String email, String contraseña, boolean es_admin, boolean activo){
        for (usuario u: listaUsuarios){
            if (u.getEmail().equals(email)){
                return false;
            }
        }
        listaUsuarios.add(new usuario(nombre, usuario, email, contraseña, es_admin, activo));
        return true;
    }
    
    public ArrayList<usuario>getListaUsuarios(){
        return listaUsuarios;
    }
    
    public String validarLogin(String usuario, String contraseña){
        for (usuario u : listaUsuarios){
            if(u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)){
                if(!u.getActivo()){
                    return "desactivado";
                }
                usuarioActual = u;
                return "exito";
            }
        }
        return "incorrecto";
    }
    
    public boolean restablecerPassword(String usuario, String nuevaPassword){
        for (usuario u : listaUsuarios){
            if (u.getUsuario().equals(usuario)){
                u.setContraseña(nuevaPassword);
                return true;
            }
        }
        return false;
    }
    
    public boolean modificarUsuario(String usuario, String nuevoEmail, String nuevoNombre){
        for (usuario u : listaUsuarios){
            if (u.getUsuario().equals(usuario)){
                u.setEmail(nuevoEmail);
                u.setNombre(nuevoNombre);
                return true;
            }
        }
        return false;
    }
    
    public boolean desactivarUsuario(String usuario){
        for (usuario u : listaUsuarios){
            if (u.getUsuario().equals(usuario)){
                u.setActivo(false);
                return true;
            }
        }
        return false;
    }
    
    public boolean usuarioEstaActivo(String usuarioIngresado) {
        for (usuario u : listaUsuarios) {
            if (u.getUsuario().equals(usuarioIngresado)) {
                return u.getActivo();
            }
        }
        return false;
    }
    
    public boolean validarContrasena(String password) {
        if (password.length() < 13) {
            return false;
        }

        boolean tieneMayuscula = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
                break;
            }
        }
        if (!tieneMayuscula) return false;

        boolean tieneEspecial = false;
        String especiales = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        for (char c : password.toCharArray()) {
            if (especiales.indexOf(c) >= 0) {
                tieneEspecial = true;
                break;
            }
        }
        if (!tieneEspecial) return false;

        return true;
    }
    
    public void setUsuarioActual(usuario u) {this.usuarioActual = u;}
    public usuario getUsuarioActual(){return usuarioActual;}
}
