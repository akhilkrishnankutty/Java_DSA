package Array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of elements for the array");
        int size =  sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Each elements");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Printing the array");

        for (int j=0;j<size;j++){
//            System.out.println(a[j]);
            System.out.print(a[j]+" ");
        }
        sc.close();

    }

}
