package com.ttnd.extra.Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Stack{
    private List<Integer> list = new LinkedList<>();
    int size=10;

    public void push(Integer i){
        if(!isFull())
        list.add(i);
        else
            System.out.println("Stack Overflow");
    }
    public void pop(){
        if(!isEmpty()){
            System.out.println( this.list.get(list.size()-1));
            this.list.remove(list.size()-1);
        }
        else
            System.out.println("Stack Underflow");
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public boolean isFull(){
        return list.size()>=size;
    }
    public int getMin(Stack stack){
        return Collections.min(this.list);
    }

}

public class Q7SpecialStackImplemetation {


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(19);
        stack.push(21);
        stack.push(19);
        stack.push(21);
        stack.push(19);
        stack.push(21);
        stack.push(12);
        stack.push(27);
        stack.push(14);
        stack.push(23);
        stack.push(14);
        stack.push(23);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
