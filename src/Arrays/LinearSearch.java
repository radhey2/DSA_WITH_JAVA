package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element for Search");
        int x = sc.nextInt();
        int res = linearSearch(arr, x);
        System.out.println("Search Element is at position : " + res);
        sc.close();
    }

    public static int linearSearch(int arr[], int k) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.out.println("Enter right element");
        }
        return -1;
    }
}
