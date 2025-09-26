// Finding the non repeating elements in an array
package Array;

import java.util.Scanner;

public class ArrayFindUniqueNu {
    private static void printer(int[] ar, int size) {
        System.out.println("Printing Array");
        for (int i =0;i<size;i++){
            System.out.print(ar[i]);
        }
    }

    public static void Uniquer(int [] arr){
        int [] j = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int k =i+1;k<arr.length;k++){

                if(arr[i]==arr[k]){
                    System.out.println("inside"+i+k);
                    j[k]=arr[i];
                }
            }
        }
        printer(j,j.length);
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
        Uniquer(ar);
    }

}
