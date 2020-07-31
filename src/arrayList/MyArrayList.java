package arrayList;
import java.util.*;
public class MyArrayList {
    public static void main(String args[]){
        List<String> al = new ArrayList<>();
        al.add("garv");
        al.add("wadhwa");
        al.add("codingyaan");
        List<String> newal = new ArrayList<>();
        newal.add("channel");
        //addAll
        newal.addAll(al);
        System.out.println(newal);
        //get
        System.out.println(newal.get(0));
        //set
        newal.set(0,"Arsh");
        System.out.println(newal.get(0));
        //remove
        newal.remove(0);
        System.out.println(newal.get(0));
        //removeAll requires an object which specifies what to delete form the list
        List<String> toRemove = new ArrayList<>();
        toRemove.add("wadhwa");
        al.removeAll(toRemove);
        System.out.println(al);
        //clear
        al.clear();
        System.out.println(al);
        //size
        int size = newal.size();
        System.out.println("size of newal - "+size);
        //contains
        boolean isContains = newal.contains("codingyaan");
        System.out.println(isContains);
        //isEmpty
        System.out.println("newal is empty or not - "+newal.isEmpty());
        //toArray
        String str[] = new String[newal.size()];
        newal.toArray(str);
        for(String e: str){
            System.out.print(e+" ");
        }
    }
}
