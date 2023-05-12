package Strings;

import java.util.Scanner;

public class PossibleSubString {
    // public static void main(String[] args) {
    // // subString("coding");
    // }

    // public static void subString(String s) {
    // for (int i = 0; i < s.length(); i++) {
    // for (int j = i + 1; j < s.length(); j++) {
    // System.out.println(s.substring(i, j));
    // }
    // }
    // }
    static void printSubstrings(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
        sc.close();
    }
}
