package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestSet {

    @org.junit.Test
    public void testIsEmpty(){
        HashSet<Integer> set = new HashSet<>();
        //set.add(1);

        assertTrue(set.isEmpty());
    }

    @org.junit.Test
    public void testAddAndSize(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        int expected = 6;

        set.add("The captain");
        set.add("had long ago decided");
        set.add("that he would");
        set.add("on the whole");
        set.add("prefer to achieve immortality");
        set.add("by not dying.");
        set.add("on the whole"); // should not add twice

        int actual = set.size();

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testSetContains(){
        HashSet<String> set = new HashSet<>();
        set.add("Rincewind");
        set.add("Twoflower");
        set.add("The Luggage");

        assertTrue(set.contains("Twoflower"));
    }
}
