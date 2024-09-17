/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadelpeluquero;

import tiendadelpeluquero.Sistema.Colas;
import tiendadelpeluquero.Sistema.DoubleLinkedList;
import tiendadelpeluquero.Sistema.Node;
import static tiendadelpeluquero.Inventarios.Articulos.generarId;
import java.util.*;
/**
 *
 * @author PC267
 */
public class TiendaDelPeluquero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        DoubleLinkedList inventario = new DoubleLinkedList();
        int cantEntrada = 1000000;
        
        for(int i = 0; i < cantEntrada; i++){
            
            String id = generarId(); 
            inventario.insertBegining(new Node(id));
        }
        
        
        
        Colas cera = new Colas();
        Colas secador = new Colas();
        Colas plancha = new Colas();
        Colas crema = new Colas();
        Colas shampoo = new Colas();
        
        inventario.Reabastecer(cera, secador, plancha, crema, shampoo);
        
        cera.imprimirCola();
        secador.imprimirCola();
        plancha.imprimirCola();
        shampoo.imprimirCola();
        crema.imprimirCola();
        
        System.out.println(" ");
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
        
        System.out.println(costoInvCera);
        System.out.println(costoInvSecador);
        System.out.println(costoInvPlancha);
        System.out.println(costoInvShampoo);
        System.out.println(costoInvCrema);
        System.out.println(costoInventario);
        
        HashMap<String, String> productosCabello = new HashMap<String, String>();
        productosCabello.put("001", "Cera de peinar");
        productosCabello.put("002", "Secador de cabello");
        productosCabello.put("003", "Plancha de cabello");
        productosCabello.put("004", "Shampoo");
         
        
     }            
    
}
