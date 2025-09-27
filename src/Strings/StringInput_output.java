package Strings;

import java.util.Scanner;

public class StringInput_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = sc.nextLine();
        System.out.println("Enter Second String");
        String s2 = sc.nextLine();
        System.out.println("First String is:-"+s1);
        System.out.println("Second String is:-"+s2);
    }
}
