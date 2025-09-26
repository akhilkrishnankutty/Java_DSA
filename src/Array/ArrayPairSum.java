//Sum of two elements from array is equal to input value
package Array;

import java.util.Scanner;

public class ArrayPairSum {
    public static void finder(int [] ar,int value){
        for (int i=0;i<ar.length;i++){
            for (int j =i+1;j<ar.length;j++){
                if (ar[i]+ar[j]==value){
                    System.out.println("Found an pair"+"("+ar[i]+","+ar[j]+")");
                }
            }
        }
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
        System.out.println("Enter the sum value");
        int value = sc.nextInt();
        finder(ar,value);
    }
}
