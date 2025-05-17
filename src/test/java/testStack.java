import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class testStack {
    @Test
    public void isStackEmpty(){
        Stack stack=new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void sizeOfStack(){
        Stack stack=new Stack();
        assertEquals(0,stack.sizeof());
    }

    @Test
    public void addElementToStack(){
        Stack stack=new Stack();
        stack.push(1);
        stack.push(5);
        assertEquals(2,stack.sizeof());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void peekElementFromStack(){
        Stack stack=new Stack();
        stack.push(3);
        stack.push(5);
        stack.push(9);
        assertEquals(9,stack.peek());
    }

    @Test
    public void removeTopElement(){
        Stack stack=new Stack();
        stack.push(67);
        stack.push(68);
        assertEquals(68,stack.pop());
        assertEquals(1,stack.sizeof());
    }

    @Test
    void testStackContentsAfterPushes_usingEquals() {
        Stack stack = new Stack();
        stack.push(45); // Stack: [45]
        stack.push(98); // Stack: [98, 45]
        stack.push(34); // Stack: [34, 98, 45]

        // Define the expected contents AS A LIST, in the order they appear in the internal list (Top to Bottom)
        List<Integer> expectedContents = Arrays.asList(34, 98, 45);

        // Get the actual contents AS A LIST using the new method
        List<Integer> actualContents = stack.toList();

        // Use assertEquals to compare the two Lists - this checks elements and order
        assertEquals(expectedContents, actualContents, "Stack contents should match the push order (Top to Bottom)");
    }

    // --- Test for contents using assertArrayEquals (requires converting List to Array) ---
    @Test
    void testStackContentsAfterPushes_usingAssertArrayEquals() {
        Stack stack = new Stack();
        stack.push(45); // Stack: [45]
        stack.push(98); // Stack: [98, 45]
        stack.push(34); // Stack: [34, 98, 45]

        // 1. Define expected data AS AN INTEGER ARRAY (Top to Bottom order)
        Integer[] expectedArray = { 34, 98, 45 };

        // 2. Get actual contents AS A LIST
        List<Integer> actualList = stack.toList();

        // 3. Convert the List<Integer> to an Integer array
        Integer[] actualArray = actualList.toArray(new Integer[0]);

        // 4. Use assertArrayEquals with the two Integer arrays
        assertArrayEquals(expectedArray, actualArray, "Stack contents (as array) should match the push order (Top to Bottom)");
    }


}
