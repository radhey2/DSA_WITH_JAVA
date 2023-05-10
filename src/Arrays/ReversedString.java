package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter the Element");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();

        }
        System.out.println("Original Array is " + Arrays.toString(s));
        reverseString(s, n);
        sc.close();

    }

    public static void reverseString(String[] s, int n) {
        Collections.reverse(Arrays.asList(s));
        System.out.println("Reversed Array is : " + Arrays.toString(s));
    }
}
