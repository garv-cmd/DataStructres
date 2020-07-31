package maps;

import java.util.HashMap;

public class FirstOccuranceGoogle {
    public static void main(String args[]){
        int arr[] = {9,3,4,2,5,6,5,6,8,9};
        // ans -> 2
        //arr[] = {1,2,3,4} -> null

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]) && !map.isEmpty()){
                System.out.println(arr[i]);
                break;
            }
            else
                map.put(arr[i],arr[i]);

        }

    }
}
