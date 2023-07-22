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
        stack.push("Don't panic.");
        int expected = 1;
        int actual = stack.size();

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testStackPop(){
        Stack<String> stack = new Stack<>();
        String expected = "and been widely regarded as a bad move.";
        stack.push("In the beginning");
        stack.push("the universe was created.");
        stack.push ("This has made a lot people very angry");
        stack.push(expected);

        String actual =stack.pop(); // takes the last item
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testStackIsEmpty(){
        Stack<String> stack = new Stack<>();

        assertTrue(stack.isEmpty());
    }

    @org.junit.Test
    public void testStackPeek(){

    }
    // Make a bigger test exercising more Stack methods.....
}
