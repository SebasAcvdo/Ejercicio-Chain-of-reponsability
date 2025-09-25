/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tickets;

import java.util.Scanner;

import Soporte.Handler;
import Soporte.Support;
import Soporte.Support_1;
import Soporte.Support_2;
import Soporte.Support_3;


public class Tickets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de soporte tecnico");
        System.out.println("Por favor, seleccione el nivel de soporte que necesita:");
        System.out.println("1. Soporte Nivel 1");
        System.out.println("2. Soporte Nivel 2");
        System.out.println("3. Soporte Nivel 3");
        System.out.print("Ingrese el numero correspondiente a su seleccion: ");
        int nivelSoporte = sc.nextInt();
     
        Handler nivel_1 = new Support_1();
        Handler nivel_2 = new Support_2();
        Handler nivel_3 = new Support_3();
        
        nivel_1.setNext(nivel_2);
        nivel_2.setNext(nivel_3);

       
       nivel_1.handlerRequest(nivelSoporte);

        
        
        
        
        
        
        
        
        
        
        
    }
}
