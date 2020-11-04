/*
In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection
of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes
the last element that was added.(Wikipedia)
 */


//Implementing a stack using an array
public class arrayStack {

    int top; //top of the array
    int max;  //maximum number of elements in the array
    int[] arr; //create an array of type int

    arrayStack(){
        top = -1; //first we consider the array to be empty
        max = 10;
        arr = new int[max]; //create array of size max of type int
    }

    boolean isEmpty(){ //checks if stack is empty
        if(top < 0){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    boolean push(int a){

        if(top == max-1){ //check to ensure no stack overflow
            System.out.println("Stack Overflow");
            return false;
        }

        else{
            top ++; //increment top
            arr[top] = a; //sets top of the array to be the new int
            System.out.println(a + " is pushed");
            return true; //return true if int is pushed
        }

    }

    boolean pop(){

        if(isEmpty()){ //check if stack is empty
            System.out.println("Stack Underflow");
            return false;
        }

        else{
            int temp = arr[top];
            top --; //decrement top
            System.out.println(temp + " is popped");
            return true; //returns true if popped
        }
    }

    void display(){

        for(int i = top; i >= 0 ; i --){
            System.out.println(arr[i]);
        }
    }

}
