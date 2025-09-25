/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soporte;

import org.omg.CORBA.Request;

/**
 *
 * @author ESTACION
 */
public interface Handler {
 
    Handler setNext(Handler nextHandler);
    Handler getNext();
    default boolean canHandle(int request){
      return false;
    }
    void handlerRequest(int request); 
}
