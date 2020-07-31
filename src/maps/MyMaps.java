package maps;

import java.util.ArrayList;

public class MyMaps {


    public static void main(String args[]){
        CreateMap<String,Integer> map = new CreateMap<>(50);


    }
}
class CreateMap <E,Z>{

    ArrayList<Integer>[] al;

    CreateMap(int data){
         al = new ArrayList[data];
    }


    public int hashFunction(E data){
        int hash = 0;
        String str = data.toString();
        int len  = str.length();
        for(int i=0;i<len;i++){
            int t = (int)str.charAt(i);
            hash = hash+(t*i);
            //System.out.println(hash);
        }
        int res = hash%al.length;
       return res;
    }

}