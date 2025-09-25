/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soporte;

/**
 *
 * @author ESTACION
 */
public class Support_2 extends  Support  {
    
    public Support_2(){
        super(2);
    } 

    @Override
    protected void processRequest(int request) {
        System.out.println("Soporte tecnico resolvio el ticket numero: "+ request);
    }
 
    protected String getHandlerName(){
        return "Soporte Nivel 2";
    }
    
    
}
