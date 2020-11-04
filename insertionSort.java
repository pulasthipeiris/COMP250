/*
Goal: order a list of integers in ascending order

Idea:
 consider the list as if it was divided into two parts, one sorted
and the other unsorted. (note: at the beginning the sorted part is
empty)

Procedure:
 Select the first element of the unsorted part of the list
 Insert such element into its correct position in the sorted part of
the list.
 Change where you divide the array from the sorted part to the
unsorted part.

Although it is one of the elementary sorting algorithms with O(n2) worst-case time,
insertion sort is the algorithm of choice either when the data is nearly sorted
(because it is adaptive) or when the problem size is small (because it has low overhead).

For these reasons, and because it is also stable, insertion sort is often used as the
recursive base case (when the problem size is small) for higher overhead divide-and-conquer
sorting algorithms, such as merge sort or quick sort.

Stable
O(1) extra space
O(n2) comparisons and swaps
Adaptive: O(n) time when nearly sorted
Very low overhead
 */

public class insertionSort {

    public void iSort(int[] array){ //insertion sorting method
        for(int i = 1; i <= array.length - 1; i ++) { //traverse the array
            int num = array[i]; //assign the element at the index to num

            int k = i; //assign the index to k

            while (k > 0 && num <= array[k - 1]) {
                array[k] = array[k - 1];
                k--;
            }
            array[k] = num;
        }
    }

    public void printArray(int[] array){ //method to print array
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        insertionSort ob = new insertionSort();
        int[] arr = {4,2,7,8,1};
        ob.iSort(arr);
        ob.printArray(arr); //prints sorted array
    }
}

