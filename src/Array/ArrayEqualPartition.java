package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayEqualPartition {
    public static int totalsum(int[] ar,int size){
        int ts =0;
        for(int i=0;i<size;i++){
            ts += ar[i];
        }
        return ts;
    }

    public static Boolean checker(int[] ar){
        int size = ar.length;
        int firstset =0;
        int totasum = totalsum(ar,size);
        int[] firstarr = new int[size];
        int [] secondarr = ar;
        for(int j=0;j<size;j++){
            firstset += ar[j];
            firstarr[j] = ar[j];
            secondarr[j] = 0;
//            System.out.println(firstarr[j]);
            int secondset = totasum-firstset;
            if (firstset==secondset){
//                System.out.print("First array " +for(int i:firstarr));
                return true;
            }

        }
        return false;
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

        System.out.println("Is Equal Sum possible ? "+  checker(ar) );
    }

}
