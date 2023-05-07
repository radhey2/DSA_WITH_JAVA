package Java_Patterns;

import java.util.Scanner;

public class CharacterPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines");
        int n = sc.nextInt();
        // CharacterPatterns.pattern(n);
        // CharacterPatterns.patternUsingWhileLoop(n);
        patternUsingWhileLoop(n);
        sc.close();
    }

    public static void pattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch);
                System.out.print("  ");
            }
            System.out.println();
            ch = (char) (ch + 1);
        }
    }

    public static void patternUsingWhileLoop(int n) {
        int i = 1;
        char ch = 'A';
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(ch);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            ch = (char) (ch + 1);
            i++;
        }
    }
}
