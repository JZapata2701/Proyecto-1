/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero.Inventarios;

import static tiendadelpeluquero.Inventarios.Articulos.generarId;
import tiendadelpeluquero.Sistema.Colas;
import tiendadelpeluquero.Sistema.DoubleLinkedList;
import tiendadelpeluquero.Sistema.Node;

/**
 *
 * @author PC267
 */
public class Inventario {
    
    

    
    public static void entradaProductos(){
        
        
        
        DoubleLinkedList inventario = new DoubleLinkedList();
        Colas cera = new Colas();
        Colas secador = new Colas();
        Colas plancha = new Colas();
        Colas crema = new Colas();
        Colas shampoo = new Colas();
        
        for(int i = 0; i < 1000000; i++){
            
            String id = generarId();
            inventario.insertBegining(new Node(id));
            
        }
        
        inventario.Reabastecer(cera, secador, plancha, crema, shampoo);
        
        int cantCera = cera.tamañoCola();
        int cantSecador = secador.tamañoCola();
        int cantPlancha = plancha.tamañoCola();
        int cantShampoo = shampoo.tamañoCola();
        int cantCrema = crema.tamañoCola();
        
        int costoCera = 11600;
        int costoSecador = 191900;
        int costoPlancha = 126900;
        int costoShampoo = 21900;
        int costoCrema = 129500;
        
        long costoInvCera = (long) cantCera * costoCera ;
        long costoInvSecador = (long) cantSecador * costoSecador;
        long costoInvPlancha = (long) cantPlancha * costoPlancha;
        long costoInvShampoo = (long) cantShampoo * costoShampoo;
        long costoInvCrema = (long) cantCrema * costoCrema;
        
        long costoInventario = (long) costoInvCera + costoInvSecador
                + costoInvShampoo + costoInvPlancha + costoInvCrema;
        
        System.out.println(" ");
        System.out.println(costoInvCera);
        System.out.println(costoInvSecador);
        System.out.println(costoInvPlancha);
        System.out.println(costoInvShampoo);
        System.out.println(costoInvCrema);
        System.out.println(costoInventario);
        
        
    }
    
}
