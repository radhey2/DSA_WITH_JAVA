package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 61, 7, 8, 9 };
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number od Rotation");
            int k = sc.nextInt();
            for (int i = 0; i < k; i++) {
                arrayRotate(arr);

            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Enter an Integer value of k");
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void arrayRotate(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int firstElement = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstElement;
        }
    }
}
