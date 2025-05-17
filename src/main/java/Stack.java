import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> array;

    public Stack(){this.array=new ArrayList<>();}

    public boolean isEmpty(){
        return array.isEmpty();
    }
    public int sizeof(){
        return array.size();
    }

    public void push(int num){
        array.addFirst(num);
    }

}
