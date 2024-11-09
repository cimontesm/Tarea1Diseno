/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.tarea1diseno;

/**
 *
 * @author Thomas Burgos
 */
import java.util.Date;

public class Reserva implements InterfaceReserva{
    private int idReserva;
    private String estado;
    private Date fechaReserva;

    @Override
    public boolean crearReserva() {
        // Lógica para crear una reserva
        return true;
    }

    @Override
    public boolean modificarReserva() {
        // Lógica para modificar una reserva
        return true;
    }

    @Override
    public boolean cancelarReserva() {
        // Lógica para cancelar una reserva
        return true;
    }
}