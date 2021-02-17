package BinaryTreeUsingArray;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(arr);

        binarySearch(arr, 0, arr.length - 1, 10);

    }

    public static void binarySearch(int[] arr, int first, int last, int searchItem) {
        int middle = (first + last) / 2;


        if ((last - first) == 1) {
            if (arr[first] == searchItem) {
                System.out.println("found it");
            } else if (arr[last] == searchItem) {
                System.out.println("found it");
            }

            return;
        }



        if (arr[middle] == searchItem) {
            System.out.println("found it");

            return;
        }

        if (searchItem > arr[middle])
            binarySearch(arr, middle, last, searchItem);
        else
            binarySearch(arr, first, middle, searchItem);
    }

}
