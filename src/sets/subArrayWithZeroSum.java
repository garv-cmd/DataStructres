package sets;

import java.util.HashSet;
import java.util.Set;

//Given an array , find if there exists a subarray with sum=0
// n < 10^5
public class subArrayWithZeroSum {
    public static void main(String args[]){

        int a[] = {4,5,-1,-1,2};
        int sum=0;

        boolean found = false;
//        for(int i=0;i<a.length;i++){
////            sum=0;
////            for(int j=i;j<a.length;j++){
////                sum+=a[j];
////                if(sum==0){
////                    found = true;
////                    break;
////                }
////            }
////            if(found)
////                break;
////        }

        Set<Integer> set = new HashSet<>();
        for(int ele : a){
            set.add(sum);
            sum+=ele;
            if(set.contains(sum)){
                found = true;
                break;
            }
        }
// if there is given k= 6 check subarray of sum k . then set.contains(sum-k)
        System.out.println(found);

    }
}
