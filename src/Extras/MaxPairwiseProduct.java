

import java.util.Scanner;

public class MaxPairwiseProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long arr[] = new long[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextLong();
        }
        long max = 0;
        int pos = 0;
        for(int i=0;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            pos = i;
            }

        }
        long max2=0;
        for(int i=0;i<size ;i++){
            if(arr[i] > max2 && i!=pos)
                max2 = arr[i];
        }
        System.out.println(max*max2);
    }
}
