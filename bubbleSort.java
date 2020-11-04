/*time complexity - O(N^2)
simplest sorting algorithm
goal: order a list such that they are in ascending order
idea: iterate through the list and swap adjacent elements if they are in the wrong order

Bubble sort has many of the same properties as insertion sort, but has slightly higher overhead.
In the case of nearly sorted data, bubble sort takes O(n) time, but requires at least 2 passes
through the data (whereas insertion sort requires something more like 1 pass).

Stable
O(1) extra space
O(n2) comparisons and swaps
Adaptive: O(n) when nearly sorted
 */


public class bubbleSort {

    public void bSort(int[] array) {
        boolean sorted = false; //array is not sorted

        int i = 0;
        while (!sorted) { //while true
        sorted = true;

            for (int j = 0; j <= array.length - i - 2; j++) { //traverse through the array
                if (array[j] > array[j + 1]) { //if the first element is larger than its adjacent element, then swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false; //once it is swapped, set boolean to false
                }
            }
            i ++;
        }
    }

//        Alt. Method
//        for(int i = 0; i < array.length - 1; i ++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

    public void printArray(int[] array){ //method to print array
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        bubbleSort ob = new bubbleSort();
        int[] arr = {4,2,7,8,1};
        ob.bSort(arr); //sorts the array
        ob.printArray(arr); //prints sorted array
    }
}
