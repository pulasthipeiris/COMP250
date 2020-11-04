/*
Goal: sort a list to be ascending order

Idea: consider the list to be of two parts: a sorted part and unsorted part

Procedure: find the smallest element in the list
swap that with the first element of the list
update the delimiter such that the sorted part now has one element and the unsorted has one less

Pseudocode

for delim from 0 to N-2 {
        min = delim
        for i from delim+1 to N-1 {
        if(list[i] < list[min]) {
        min = i
        }
        }
        if(min != delim) {
        swap(list[min], list[delim])
        }
        }

From the comparions presented here, one might conclude that selection sort should never be used.
It does not adapt to the data in any way (notice that the four animations above run in lock step),
so its runtime is always quadratic.

However, selection sort has the property of minimizing the number of swaps. In applications where
the cost of swapping items is high, selection sort very well may be the algorithm of choice.

Not stable
O(1) extra space
Θ(n2) comparisons
Θ(n) swaps
Not adaptive
*/

public class selectionSort {

    public void sSort(int[] array) {

        for (int delim = 0; delim <= array.length - 2; delim++) {
            int min = delim;

            for(int i = delim + 1; i <= array.length -1; i ++){
                if(array[i] < array[min]){
                    min = i;
                }
            }

            if(min != delim){
                int temp = array[min];
                array[min] = array[delim];
                array[delim] = temp;
            }
        }
    }

    public void printArray(int[] array){ //method to print array
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        selectionSort ob = new selectionSort();
        int[] arr = {4,2,7,8,1};
        ob.sSort(arr);
        ob.printArray(arr); //prints sorted array
    }
}
