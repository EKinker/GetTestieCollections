package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AllTheTests {

    @Test
    public void testVector() { // this is not a vector test, but I can't figure out when you'd use a vector
        Vector<Integer> v = new Vector<>();
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(2, 10);
        String expected = "3 4 10 5";

        StringJoiner join = new StringJoiner(" ");
        for (int i : v) {
            join.add(String.valueOf(i));
        }
        String actual = join.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTreeMap() {
        TreeMap<Character, Integer> map = new TreeMap<>();
        map.put('A', 24);
        map.put('Z', 100);
        map.put('C', 29);

        Character expected = 'Z';
        Character actual = map.lastKey();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        int expected = 11;
        set.add(55);
        set.add(22);
        set.add(expected);

        int actual = set.first();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIterator() {
        String expected1 = "Apples", expected2 = "Oranges", expected3 = "Hand Grenades";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(expected1, expected2, expected3));

        Iterator<String> iterator = list.iterator();

        Assert.assertEquals(expected1, iterator.next());
        Assert.assertEquals(expected2, iterator.next());
        Assert.assertEquals(expected3, iterator.next());
    }

    @Test
    public void testPriorityQ() {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(10);
        q.add(3);

        Assert.assertEquals(4, q.size()); //initial size
        Assert.assertEquals((Integer)1, q.peek()); // check out the first
        Assert.assertEquals(4, q.size()); //no change to size
        Assert.assertEquals((Integer)1, q.poll()); //remove the first
        Assert.assertEquals(3, q.size()); //size is 1 less
        Assert.assertEquals((Integer)3, q.peek()); //next number is first in the list now
    }

    @Test
    public void testComparable(){

    }
}
