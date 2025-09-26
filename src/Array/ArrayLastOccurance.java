// find the last occurance of an element from the input digit
package Array;

import java.util.Scanner;


public class ArrayLastOccurance {
    public static void laster(int [] ar,int a){
        int last = -1;
        for (int i =0;i<ar.length;i++){
            if (ar[i]==a){
                last = i;
            }
        }
        System.out.println("Element Last Occured on "+ last);
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
        System.out.println("Enter the element to search");
        int last = sc.nextInt();
        laster(ar,last);
    }
}
