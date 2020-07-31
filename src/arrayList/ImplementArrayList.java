package arrayList;

import java.util.ArrayList;

public class ImplementArrayList {
    public static void main(String args[]){
        int a1[] = {0,3,4,31};
        int a2[] = {4,6,30};
        mergeSortedArray(a1,a2);


    }
    public static void mergeSortedArray(int a1[] , int a2[]){
       int a = a1[0];
       int b = a2[0];
       if(a1.length==0){
           for(int i:a2)
               System.out.println(i);
           return;
       }
       if(a2.length==0){
           for(int i:a1)
               System.out.println(i);
           return;

       }
        ArrayList<Integer> al = new ArrayList<>();
       int i=0,j=0,q=0,w=0;
       int tot =a1.length+a2.length;
       int max = Math.max(a1.length,a2.length);
        while (i<a1.length && j <a2.length)
        {
            if (a1[i] < a2[j])
                al.add(a1[i++]);
            else
                al.add(a2[j++]);
        }
        while(i < a1.length)
            al.add(a1[i++]);
        while(j<a2.length)
            al.add(a1[j++]);
        for(int x : al){
            System.out.println(x);
        }
    }
}
