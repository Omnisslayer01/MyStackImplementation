import org.junit.jupiter.api.Test;

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
    public void push(){
        Stack stack=new Stack();
        stack.push(1);
        stack.push(5);
        assertEquals(2,stack.sizeof());
        assertFalse(stack.isEmpty());
    }
}
