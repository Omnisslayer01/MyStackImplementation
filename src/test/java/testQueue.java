import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class testQueue {

    @Test
    void aNewQueueIsEmpty(){

        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void aNewQueueHasSizeZero(){
        Queue queue=new Queue();
        assertEquals(0,queue.size());
    }

    @Test
    void testEnqueueAnElementIntoQueue(){
        Queue queue=new Queue();
        queue.Enqueue(90);
        assertEquals(1,queue.size());
    }

    @Test
    void testDisplayQueue(){
        Queue queue=new Queue();
        queue.Enqueue(20);
        queue.Enqueue(34);
        queue.Enqueue(56);
        queue.Enqueue(89);
        List<Integer> Expectedlist=Arrays.asList(20,34,56,89);
        List<Integer> ActualList=queue.toList();
        assertEquals(Expectedlist,ActualList);
    }


    @Test
    void testDequeueAnElementIntoQueue(){
        Queue queue=new Queue();
        queue.Enqueue(45);

        int number=queue.Dequeue();

        assertEquals(45,number);
        assertEquals(0,queue.size());
        assertTrue(queue.isEmpty());
    }







}