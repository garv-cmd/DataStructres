package Extras;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        if(size == 0){
            System.out.println(0);
        }
        else if(size==1){
            System.out.println(1);
        }
        else{
            for(int i=0;i<=size;i++){
                arr[i] = i;
            }
            for(int i=2;i<=size;i++){
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.println(arr[size]);
        }

    }
}
