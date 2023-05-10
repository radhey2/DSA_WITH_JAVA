package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        arrayReverse(arr, n);
    }

    public static void arrayReverse(Integer[] arr, int n) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reversed Array Element is");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
