/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author PC267
 */
public class DoubleLinkedList {
    
    public Node head;
    private Node end;
    String regex = "^AB-(01(001(01)|002(02)|003(03)|004(04))|02(00105))$";
    
    Pattern pattern = Pattern.compile(regex);
    
    public DoubleLinkedList(){
        
    }
    
    public DoubleLinkedList(Node head,Node end){
        
        this.head = head;
        this.end = end;
        
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }
    
    public void insertBegining(Node node){
        
        Matcher matcher = pattern.matcher(node.getValue());
        if(matcher.matches()){
            
            if( this.head == null){
                this.head = node;
                this.end = node;
            
            }else{
                node.setNext(this.head);
                this.head.setBefore(node);
                this.head = node;
            
            }
            
        }
        
        
    }
    
    public String removeEnd(){
        if(listEmpty()){
            return null;
        } else if(this.head.getNext() == null){
            String node = this.head.value;
            this.head = null;
            this.end = null;
            return node;
        }
        
        Node oldEnd = this.end;
        
        this.end = this.end.getBefore();
        this.end.setNext(null);
        
        oldEnd.setBefore(null);
        return oldEnd.value;
    }
    
    private boolean listEmpty(){
        
        if(this.head == null){
            return true;
        }
        return false;
    }
    
    public void printList() {
        if (this.head == null) {
            System.out.println("The list is empty.");
        } else {
            var index = 0;
            Node actualNode = this.head;
            while (actualNode != null) {
                System.out.println("Node value: " + actualNode.getValue() + " - Index: " + index);
                actualNode = actualNode.getNext();
                index++;
            }
        }
    }
    
    public void Reabastecer(Colas cera,Colas secador,
            Colas plancha,Colas crema,Colas shampo){
        
        while(this.head != null){
            String articulo = this.removeEnd();
            
            
            
            if(articulo.substring(3, 5) == "01"){
                if(articulo.substring(7, 10) == "001"){
                    cera.agregarCola(articulo);
                    System.out.println(articulo);
                }else if(articulo.substring(7, 10) == "002"){
                    secador.agregarCola(articulo);
                }else if(articulo.substring(7, 10) == "003"){
                    plancha.agregarCola(articulo);
                }else{
                    shampo.agregarCola(articulo);
                }
            }else if(articulo.substring(4, 5) == "002"){
                crema.agregarCola(articulo);
            }
        }
    
    }
    
}
