package Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        removeConsecutiveDuplicateCharacter(str);
        sc.close();
    }

    public static void removeConsecutiveDuplicateCharacter(String str) {

        StringBuilder sc = new StringBuilder();

        sc.append(str.charAt(0));
        System.out.println(sc);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sc.append(str.charAt(i));
            }
        }
        System.out.println(sc);
    }
}
