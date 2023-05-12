package Strings;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        toUpperCase(str);
        sc.close();

    }

    public static void toUpperCase(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String upper = word.substring(0, 1).toUpperCase() + word.substring(1);
            sb.append(upper).append(" ");
        }
        String capitalizedStr = sb.toString().trim();
        System.out.println(capitalizedStr);
    }
}
