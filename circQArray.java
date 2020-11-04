/*
time and space complexity for enqueue, resize is O(n)
for everything else it's O(1)
 */


import java.util.NoSuchElementException;

public class circQArray {

    private int front, rear;
    private int[] nums;

    public circQArray(int initialSize){
        this.front = this.rear = -1;
        this.nums = new int[initialSize];
    }

    public void enqueue(int data){
        if(isFull()){
            resize();
        }
        else if(isEmpty()){
            front++;
        }
        rear = (rear+1)%nums.length;
        nums[rear] = data;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        int temp = nums[front];

        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front + 1)%nums.length;
        }
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return nums[front];
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    private boolean isFull(){
        if((rear+1)%nums.length == front){
            return true;
        } return false;
    }

    private void resize(){
        int[] tempArray = new int[nums.length*2];
        int i = 0;
        int j = front;

        do {
            tempArray[i++] = nums[j];
            j = (j + 1) % nums.length;
        }while(j!=front);

        front = 0;
        rear = nums.length-1;
        nums = tempArray;
    }

}
