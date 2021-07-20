package LiskovSubstitution;

import java.util.ArrayList;

public class StackWrong extends ArrayList<Integer> {

    private ArrayList<Integer> arrayList = new ArrayList<>();

    private int topPointer = 0;

    public void push(Integer elem) {
        this.add(elem);
        topPointer++;
    }

    public void pop() {
        remove(topPointer-1);
        topPointer--;
    }
    public Integer top() {
        return get(topPointer-1);
    }

    public static void main(String[] args) {
        StackWrong stack = new StackWrong();

        stack.push(1);
        stack.push(3);
        stack.push(6);
        stack.remove(1);

        System.out.println(stack.top());
    }
}

