/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tickets;

import Soporte.Handler;
import Soporte.Support;
import Soporte.Support_1;
import Soporte.Support_2;
import Soporte.Support_3;

/**
 *
 * @author ESTACION
 */
public class Tickets {

    public static void main(String[] args) {
     
        Handler nivel_1 = new Support_1();
        Handler nivel_2 = new Support_2();
        Handler nivel_3 = new Support_3();
        
        nivel_1.setNext(nivel_2);
        nivel_2.setNext(nivel_3);
        
       int solicitud_1 = 1;
       int solicitud_2 = 2;
       int solicitud_3 = 3;
       
       nivel_1.handlerRequest(solicitud_1);
       nivel_1.handlerRequest(solicitud_2);
       nivel_1.handlerRequest(solicitud_3);
        
        
        
        
        
        
        
        
        
        
        
    }
}
