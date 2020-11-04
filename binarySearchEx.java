
/*
Exercise

Consider an array of integers a sorted in ascending order. Write a method that takes the array as input
and returns the index i such that a[i] = i. The method should return -1 if there’s no such index. Note
that you cannot assume that all the elements in the array are unique
 */


public class binarySearchEx {

    public static int matchingIndex(int[] a, int low, int high){ //takes input array, and pointers to highest and lowest index

        if(low > high) return -1; //check if low and high are valid

        int mid = (high + low)/2; //set a pointer to the middle index of the array
        int midValue = a[mid];

        if(mid == midValue) return mid;//check if middle index has matching value, if MATCHES, return

        int left = matchingIndex(a, low, (mid - 1)); //repeat for left side portion of array

        if(left >= 0) return left; //if MATCHES in left, return

        return matchingIndex(a, mid + 1, high); //repeat for right section

    }

    public static void main(String[] args){

        int[] a = {1, 2, 3, 4, 5, 5, 10};
        int high = a.length - 1;
        int low = 0;
        int index = matchingIndex(a, low, high);
        if (index == -1)
            System.out.print("No matches found!");
        else
            System.out.print("Match found at index: "+index);
    }

}
