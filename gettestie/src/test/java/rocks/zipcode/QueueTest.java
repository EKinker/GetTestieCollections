package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class QueueTest {

    @Test
    public void testRemoveFirst(){
        LinkedList<String> queue = new LinkedList<>();
        int expectedSize = 3;
        String expected = "Frodo";
        queue.add(expected);
        queue.add("Sam");
        queue.add("Pippin");
        queue.add("Merry");

        String actual = queue.removeFirst().toString();
        int actualSize = queue.size();

        assertEquals(expected, actual);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testPeek(){
        LinkedList<Integer> list = new LinkedList<>();
        int expected = 4;

        list.add(expected);
        list.add(6);
        list.add(7);
        list.add(8);

        int actual = list.peek();
        int actualSize = list.size();

        assertEquals(expected, actual);
        assertEquals(expected, actualSize);
    }

}
