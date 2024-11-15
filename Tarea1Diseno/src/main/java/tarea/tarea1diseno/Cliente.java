/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.tarea1diseno;

/**
 *
 * @author CMONTES
 */
public class Cliente extends Usuario {

    String email;
    String contraseña;

    public Cliente(String email, String contraseña, int id, String nombre) {
        super(id, nombre);
        this.email = email;
        this.contraseña = contraseña;
    }

    public boolean iniciarSesion() {
        //logica
        return true;
    }

    public void cerrarSesion() {

    }

    public void registrarse() {

    }

}
