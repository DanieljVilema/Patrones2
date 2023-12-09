/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author danie
 */
public abstract class ManejadorBase implements Manejador {
   Manejador siguiente;

    @Override
    public  void manejarSolicitud(Solicitud solicitud){
        if(siguiente!=null){
            siguiente.manejarSolicitud(solicitud);
        }
    }

    @Override
    public void setSiguiente(Manejador siguiente){
        this.siguiente= siguiente;
    }
   
}
