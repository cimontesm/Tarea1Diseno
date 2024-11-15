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
import java.util.List;

public class Crucero {

    private int idCrucero;
    private String nombre;
    private String destino;
    private Date fechaDeSalida;
    private int duracion;
    
    Cabina cabina;
    Itinerario itineriario;

    public String obtenerDetalles() {
        // Lógica para obtener detalles del crucero
        return "Detalles del crucero";
    }

    public List<Crucero> buscarCrucero() {
        // Lógica para buscar cruceros
        return null;
    }

    public Crucero(int idCrucero, String nombre, String destino, Date fechaDeSalida, int duracion) {
        this.idCrucero = idCrucero;
        this.nombre = nombre;
        this.destino = destino;
        this.fechaDeSalida = fechaDeSalida;
        this.duracion = duracion;
        cabina = new Cabina();
        itineriario = new Itinerario();
    }
    
    
}
