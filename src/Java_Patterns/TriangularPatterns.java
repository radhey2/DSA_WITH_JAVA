package Java_Patterns;

import java.util.Scanner;

public class TriangularPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines");
        int n = sc.nextInt();

        // TriangularPatterns.pattern(n);
        // TriangularPatterns.patternUsingWhileLoop(n);
        // TriangularPatterns.pattern2(n);
        // TriangularPatterns.pattern3(n);
        // TriangularPatterns.pattern4(n);
        // pattern(n);
        pattern2(n);

        sc.close();
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternUsingWhileLoop(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern2(int n) {
        int count = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(count);
                System.out.print(" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        char[] arr = { '1', '1', '1', '1' };
        if (arr.length == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j]);
                    System.out.print(" ");

                }
                System.out.println();
            }
        } else {
            System.out.println("Enter the value n = 4 or less than 4");
        }
    }

    public static void pattern4(int n) {
        String s = new String();

        for (int i = 0; i < n; i++) {
            s += "1";

        }
        for (int j = 0; j < n; j++) {
            System.out.print(s.substring(0, j + 1));
            System.out.println();

        }

    }

}
