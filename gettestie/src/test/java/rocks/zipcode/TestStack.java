package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void testStackPush(){
        Stack<String> stack = new Stack<>();
        stack.push("Rabble Rabble");
        int expected = 1;
        int actual = stack.size();

        assertEquals(expected, actual);
    }

    // Make a bigger test exercising more Stack methods.....
}
