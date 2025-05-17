import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


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


}
