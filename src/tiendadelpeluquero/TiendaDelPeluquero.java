/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadelpeluquero;

import static tiendadelpeluquero.Inventarios.Articulos.generarId;
import tiendadelpeluquero.Colas;

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
        Colas shampo = new Colas();
        
        inventario.Reabastecer(cera, secador, plancha, crema, shampo);
        
        cera.imprimirCola();
        secador.imprimirCola();
        plancha.imprimirCola();
        shampo.imprimirCola();
        crema.imprimirCola();
        
    }
    
}
