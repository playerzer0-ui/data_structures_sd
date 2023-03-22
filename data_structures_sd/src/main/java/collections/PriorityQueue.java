package collections;

public class PriorityQueue extends Queue{

    public PriorityQueue(){}

    @Override
    public boolean add(int value){
        Node newNode = new Node(value);
        if(first == null){
            first = newNode;
            last = newNode;
        }
        //if value is smaller than the first
        else if(value < first.data){
            newNode.next = first;
            first = newNode;
        }
        //if value is smaller than the last
        else if(value >= last.data){
            last.next = newNode;
            last = newNode;
        }
        else{
            Node prev = first;
            Node current = first.next;
            while(current.data >= value){
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
            newNode.next = current;
        }
        size++;
        return true;
    }

}
