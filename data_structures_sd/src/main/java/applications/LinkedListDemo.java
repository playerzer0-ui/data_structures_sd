package applications;

import collections.LinkedList;

/**
 *
 * @author michelle
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList tester = new LinkedList();
        tester.add(1);
        tester.add(2);
        tester.add(3);
        tester.add(4);
        tester.add(5);
        tester.add(6);
        System.out.println("Displaying initial list:");
        printList(tester);
        
        // Removing from list
        tester.remove(3);
        System.out.println("After removing from position 3 (#4 should not appear)");
        printList(tester);
    }   
    
    public static void printList(LinkedList tester){
        for(int i = 0; i < tester.size(); i++){
            System.out.println(i+") " + tester.get(i));
        }
    }
}
