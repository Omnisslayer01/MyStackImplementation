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


}
