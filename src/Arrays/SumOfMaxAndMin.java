package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SumOfMaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter the Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr, n);
        sc.close();
    }

    public static void sum(Integer[] arr, int n) {
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        int sum = max + min;
        System.out.println("Sum of Min And Max is : " + sum);

    }
}
