/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soporte;

import java.net.Authenticator;

/**
 *
 * @author ESTACION
 */
public abstract class Support implements Handler{
    
    protected Handler nextHandler;
    protected int supportedType;

    public Support(int supportedType) {
        this.supportedType = supportedType;
    }
    
    
    
    @Override
    public Handler setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    @Override
public boolean canHandle(int request) {
    return this.supportedType == request;
}

    
    protected abstract void processRequest (int request);
    
    protected String getHandlerName(){
        return this.getClass().getSimpleName(); 
    }
    
    protected void passToNext(int request){
        if(nextHandler != null){
            System.out.println("No logramos resolver su problema, su problema fue escalado a " + getHandlerName());
            nextHandler.handlerRequest(request);
        }else{
            System.out.println("No se pudo procesar");
        }
    }
    
    @Override
    public void handlerRequest(int request) {
        if(canHandle(request)){
            processRequest(request);
        }else{
            passToNext(request);
        }
    }

    @Override
    public Handler getNext() {
        return this.nextHandler;
    }

    
}
