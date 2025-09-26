//Moving all the odd number to starting of array followed by even numbers
package Array;

import java.util.Scanner;

public class ArrayOddMover {
    private static int[] swapper(int[] ar, int left, int right) {
        int temp = ar[left];
        ar[left] = ar[right];
        ar[right] = temp;
        return ar;
    }
    public static void Mover(int [] ar){
        int size = ar.length;
        int left = 0;
        int right = size-1;

        while (left<right){
            if (ar[left] % 2 == 0 && ar[right]%2 ==1) {
                ar = swapper(ar,left,right);
            }
            left ++;
            right --;
        }
        printer(ar,size);
    }

    private static void printer(int[] ar, int size) {
        System.out.println("Printing Array");
        for (int i =0;i<size;i++){
            System.out.print(ar[i]);
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
        Mover(ar);
    }
}
