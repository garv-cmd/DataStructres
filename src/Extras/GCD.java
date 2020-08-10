package Extras;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = EuclidGCD(a,b);
        System.out.println(res);
    }
    static int EuclidGCD(int a,int b){
        if(b==0){
            return a;
        }
        int a1 = a%b;
        return EuclidGCD(b,a1);

    }
}
