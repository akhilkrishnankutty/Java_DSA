package Array;

import java.util.Scanner;

public class ArrayDupReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of elements");
        int size = sc.nextInt();
        int [] ar = new int[size];
        System.out.println("Enter Each element");
        for (int i =0; i<size;i++){
            ar[i] = sc.nextInt();

        }
        System.out.println("Printing the Array");
        for (int j = 0;j<size;j++){
            System.out.print(ar[j]+" ");

        }
        System.out.println(" ");

//        second array from first array
        int [] ar2 = ar;

        System.out.println("Printing Second array");

        for (int k=0;k<size;k++){
            System.out.print(ar2[k] + " ");
        }
    }
}
