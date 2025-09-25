/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soporte;

/**
 *
 * @author ESTACION
 */
public class Support_1 extends  Support  {
    
    
    
    public Support_1(){
        super(1);
    } 

    @Override
    protected void processRequest(int request) {
        System.out.println("Soporte tecnico resolvio el ticket numero: "+ request);
    }
 
    protected String getHandlerName(){
        return "Soporte Nivel 1";
    }
    
}
