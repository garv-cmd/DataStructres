package searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindIt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<6;i++){
            int m = sc.nextInt();
            if(set.add(m)){
                System.out.println(m);
            }
        }
    }

}
