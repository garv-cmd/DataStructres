package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {
    public static void main(String args[]){
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        map.put("one",10);//it will update one
        map.putIfAbsent("four",4);
        System.out.println(map.get("four"));

        System.out.println(map.containsKey("three"));

        System.out.println(map.containsValue(5));
        map.put("five",6);

        map.replace("five",6,5);
        System.out.println(map.get("five"));

        map.remove("five");
System.out.println(map);

        map.remove("four",5);//it will only remove when key will have its right value(4)
        System.out.println(map);

        //keySet - gives a set of keys
        System.out.println(map.keySet());
        //values - return set of values
        System.out.println(map.values());
        //entrySet - gives a set of total entries
        System.out.println("Entry set - "+map.entrySet());
        //if you want to iterate through entries
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries){
            entry.setValue(entry.getValue()*100);
            System.out.print(entry.getKey()+" ");
        }
        System.out.println(map);

    }
}
