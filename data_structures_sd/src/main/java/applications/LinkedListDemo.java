package applications;

import collections.LinkedList;
import collections.PriorityQueue;
import collections.Queue;

/**
 *
 * @author michelle
 */
public class LinkedListDemo {
    public static void main(String[] args) {
//        LinkedList tester = new LinkedList();
//        tester.add(1);
//        tester.add(2);
//        tester.add(3);
//        tester.add(4);
//        tester.add(5);
//        tester.add(6);
//        System.out.println("Displaying initial list:");
//        printList(tester);
//
//        // Removing from list
//        tester.remove(3);
//        System.out.println("After removing from position 3 (#4 should not appear)");
//        printList(tester);
//        // Removing from end of list
//        tester.remove(4);
//        System.out.println("After removing from position 4 (#6 should not appear)");
//        printList(tester);
//
//        tester.add(7);
//        printList(tester);
        
        Queue q = new PriorityQueue();
        q.add(2);
        q.add(1);
        printList(q);
        q.add(3);
        q.add(0);
        System.out.println(q.size());
        printList(q);
        
    }   
    
    public static void printList(LinkedList tester){
        for(int i = 0; i < tester.size(); i++){
            System.out.println(i+") " + tester.get(i));
        }
    }
}
