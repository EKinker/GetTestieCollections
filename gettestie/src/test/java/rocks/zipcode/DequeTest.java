package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeTest {

    @Test
    public void testIterator(){
        Deque<String> deque = new ArrayDeque<>();

        deque.addLast("Miney ");
        deque.addFirst("Meenie ");
        deque.addLast("Moe");
        deque.addFirst("Eenie ");

        Iterator<String> iterator = deque.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element);
        }


    }

}
