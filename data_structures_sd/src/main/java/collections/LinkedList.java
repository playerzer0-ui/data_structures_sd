package collections;

/**
 *
 * @author michelle
 */
public class LinkedList {

    private Node first;
    private int size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
        // return size == 0;
    }

    public int size() {
        return size;
    }

    private static class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }
}
