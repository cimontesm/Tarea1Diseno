/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.tarea1diseno;

/**
 *
 * @author CMONTES
 */
public class Incidente implements InterfaceGestionIncidente{
    
    private int incidente;
    private String descripcion;
    private String estado;
    
     @Override
    public boolean reportarIncidente() { 
        return true;
    }

    @Override
    public boolean actualizarEstado() {
        return true; 
    }
    

    
}
