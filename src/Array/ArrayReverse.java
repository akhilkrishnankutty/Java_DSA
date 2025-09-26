package Array;

import java.util.Scanner;

public class ArrayReverse {
    private static void printer(int[] ar, int size) {
        System.out.println("Printing Array");
        for (int i =0;i<size;i++){
            System.out.print(ar[i]);
        }
    }


    public static void reverser(int [] ar){
        int [] rev = new int[ar.length];
        int j=0;
        for (int i = ar.length-1;i>0;i--){
            rev[j] = ar[i];
            j++;

        }
        printer(rev,rev.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of elements");
        int size = sc.nextInt();
        int [] ar = new int[size];
        System.out.println("Enter Each element");
        for (int i =0; i<size;i++){
            ar[i] = sc.nextInt();

        }
        reverser(ar);
    }
}
