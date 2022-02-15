package OOPG.Week4;

public class StackOfIntegers {
    
    int[] elements = new int[16];
    int size = 0;

    StackOfIntegers(){}
    StackOfIntegers(int capacity){
    int[] elements = new int[capacity];
    }

    public boolean empty(){
        boolean empty;
        if (size==0){
            empty = true;
        }
        else{
            empty = false;
        }
        return empty;
    }

    public int peek(){
        int peekValue = elements[size-1];
        return peekValue; 
    }

    public void push(int a){
        elements[size] = a;
        size++;
    }

    public int pop(){
        int popValue = elements[size-1];
        size--;
        return popValue;
    }

    public int getSize(){
        return size;
    }
}
