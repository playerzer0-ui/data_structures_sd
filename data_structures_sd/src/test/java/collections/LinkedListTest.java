package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michelle
 */
public class LinkedListTest {

    public LinkedListTest() {
    }

    /**
     * Test of isEmpty method, of class LinkedList, where list is empty.
     */
    @Test
    public void testIsEmpty_EmptyList() {
        LinkedList instance = new LinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class LinkedList, where list is populated.
     */
    @Test
    public void testIsEmpty_PopulatedList() {
        LinkedList instance = new LinkedList();
        instance.add(0);
        instance.add(1);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class LinkedList, where list is empty.
     */
    @Test
    public void testSize_EmptyList() {
        LinkedList instance = new LinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class LinkedList, with 3 elements in list.
     */
    @Test
    public void testSize_PopulatedList() {
        LinkedList instance = new LinkedList();
        instance.add(0);
        instance.add(1);
        instance.add(2);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class LinkedList, where position provided breaks lower bound.
     */
    @Test
    public void testRemove_InvalidPosition_LessThanZero() {
        int index = -1;
        LinkedList instance = new LinkedList();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            instance.remove(index);
        });
    }

    /**
     * Test of add method, of class LinkedList, where list is initially empty.
     */
    @Test
    public void testAdd_EmptyList() {
        int value = 0;
        LinkedList instance = new LinkedList();
        boolean expResult = true;
        boolean result = instance.add(value);
        assertEquals(expResult, result);

        int expSize = 1;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);

        int expValue = value;
        int resultValue = instance.get(0);
        assertEquals(expValue, resultValue);
    }

    /**
     * Test of add method, of class LinkedList, where list is already populated.
     */
    @Test
    public void testAdd_PopulatedList() {
        int value = 0;
        LinkedList instance = new LinkedList();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        boolean expResult = true;
        boolean result = instance.add(value);
        assertEquals(expResult, result);

        int expSize = 5;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);

        int expValue = value;
        int resultValue = instance.get(4);
        assertEquals(expValue, resultValue);
    }
}
