/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author danie
 */
public interface Manejador {
    public void setSiguiente(Manejador m);
    public void manejarSolicitud(Solicitud solicitud);
}
