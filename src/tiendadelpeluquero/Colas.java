/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author PC267
 */
public class Colas {
    
    private Queue<String> cola;
    
    public Colas(){
        
        cola = new LinkedList<>();
        
    }
    
    public void agregarCola(String valor){
        
        cola.offer(valor);
        
    }
    
    public String eliminarCola(){
        
        String producto = cola.poll();
        return producto;
    }
    
    public void imprimirCola(){
        
        Iterator<String> it = cola.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next() + "->");
        }
        
    }
}
