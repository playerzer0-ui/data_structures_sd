/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.NoSuchElementException;

/**
 *
 * @author michelle
 */
public class Queue extends LinkedList{
    @Override
    public boolean add(int value, int pos){
        throw new UnsupportedOperationException("Method not available for queues");
    }
    
    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return super.remove(0);
    }
    
   
    public void empty(){
        super.clear();
    }
}
