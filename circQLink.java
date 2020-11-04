/*
Time complexity is O(1) for all methods and so is the space complexit
but it may use more space than an array
 */

import java.util.NoSuchElementException;

public class circQLink {
    Node rear;

    public circQLink(Node rear){
        this.rear = rear;

        if(this.rear != null){
            this.rear.next = this.rear;
        }
    }

    public void enqueue(int data){
        Node n = new Node(data);

        if(rear == null){ //if queue(linkedlist) is empty
            n.next = n; //then node refers to itself
        }
        else{
            n.next = rear.next;
            rear.next = n;
        }
        rear = n;
    }

    public int dequeue(){
        if(rear == null){ //if queue is empty
            throw new NoSuchElementException();
        }

        int temp = rear.next.data;

        if(rear.next == rear){ //if queue has one node
            rear = null;
        }
        else{
            rear.next = rear.next.next;
        }
        return temp;
    }

    public int peek(){
        if(rear == null){
            throw new NoSuchElementException();
        }
        return rear.next.data;
    }

    public boolean isEmpty(){
        if(rear==null){
            return true;
        }
        return false;
    }
}
