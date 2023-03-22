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

    /**
     * add employee to the end of the list
     * @param value the employee
     * @return true
     */
    @Override
    public boolean add(int value){
        return super.add(value);
    }
    
    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return super.remove(0);
    }

    /**
     * get the first element from queue
     * @return employee or null
     */
    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        else{
            return super.get(0);
        }
    }
   
    public void empty(){
        super.clear();
    }
}
