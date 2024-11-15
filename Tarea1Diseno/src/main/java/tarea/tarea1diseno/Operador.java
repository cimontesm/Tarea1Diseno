/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.tarea1diseno;

/**
 *
 * @author CMONTES
 */
public class Operador extends Usuario implements Notificable{

    
    private String nombreOperador;

    public Operador(String nombreOperador, int id, String nombre) {
        super(id, nombre);
        
        this.nombreOperador = nombreOperador;
    }

    public boolean gestionarIncidente() {
        //logica
        return true;
    }

    @Override
    public String notificarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
