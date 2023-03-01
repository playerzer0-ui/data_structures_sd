package collections;

/**
 *
 * @author michelle
 */
public class DynamicArray {
    private final static int INITIAL_CAPACITY = 10;
    private int [] data;
    private int size;
    
    public DynamicArray(){
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }
    
    public DynamicArray(int capacity){
        data = new int[capacity];
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    private void grow(){
        int [] temp = new int[data.length*2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    
    public boolean add(int value){
        if(size < data.length){
            data[size] = value;
        }else{
            grow();
            data[size] = value;
        }
        size++;
        return true;
    }

    
    public boolean contains(int value){
        for(int i = 0; i < size; i++){
            if(data[i] == value){
                return true;
            }
        }
        return false;
    }
    
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Illegal position supplied.");
        }
        return data[index];
    }
    
    public int remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Illegal position supplied.");
        }
        int removedElement = data[index];
        for(int i = index; i < size-1; i++){
            data[i] = data[i+1];
        }
        data[size-1] = 0;
        size--;
        return removedElement;
    }
    
    public void clear(){
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }
}
