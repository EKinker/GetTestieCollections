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
        Stack<String> stack = new Stack<>();
        int expectedStackSize = 3;
        String expectedPeek = "for all the fish!";

        stack.push("So long");
        stack.push("and thanks");
        stack.push(expectedPeek);
        String actualPeek = stack.peek();

        assertEquals(expectedPeek, actualPeek);
        assertEquals(expectedStackSize, stack.size());
    }

    @org.junit.Test
    public void testStackSearch(){
        Stack<String> stack = new Stack<>();
        stack.push("Arthur");
        stack.push("Trillian");
        stack.push("Ford");
        int expected = 3;

        int actual = stack.search("Arthur"); //counts down the stack

        assertEquals(expected, actual);
    }
    // Make a bigger test exercising more Stack methods.....
}
