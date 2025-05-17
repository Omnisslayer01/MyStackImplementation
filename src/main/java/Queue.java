import java.util.ArrayList;
import java.util.List;

public class Queue {
    private ArrayList<Integer> elementsQ;

    public Queue(){this.elementsQ =new ArrayList<>(); }

    public boolean isEmpty(){return elementsQ.isEmpty();}

    public int size(){return elementsQ.size();}

    public void Enqueue(int num){elementsQ.addLast(num);}

    public int peek(){return elementsQ.getLast();}

    public int Dequeue(){return elementsQ.removeFirst();}

    public List<Integer> toList() {return new ArrayList<>(elementsQ);}

}
