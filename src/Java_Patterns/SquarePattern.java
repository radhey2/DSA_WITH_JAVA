package Java_Patterns;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines");
        int n = sc.nextInt();
        // App.pattern(3);
        // App.pattern2(3);
        SquarePattern.pattern2UsingWhileLoop(n);
        sc.close();
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern2UsingWhileLoop(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
