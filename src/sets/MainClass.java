package sets;

import java.util.*;

public class MainClass {
    public static void main(String args[]){
        Set<String> st = new HashSet<>();//use LinkedHashSet for output order
        //use TreeSet  - elements in sorted form
        st.add("apple");
        st.add("samsung");

        System.out.println(st.add("oneplus"));
        st.add("xiaomi");
        System.out.println(st.add("xiaomi"));
        System.out.println(st);
        Set<Integer> num = new LinkedHashSet<>();//uses linkedlist so all operations/methods will be of linked list
        num.add(20);
        num.add(30);
        num.add(10);
        System.out.println(num);

        Set<Integer> tree = new TreeSet<>();
        tree.addAll(num);
        System.out.println(tree);

        //operations in set
        Set<Integer> x = new HashSet<>();
        x.add(3);
        x.add(6);
        x.add(5);

        Set<Integer> y = new HashSet<>();
        y.add(3);
        y.add(16);
        y.add(15);

        //just like union in sets. we use addAll
        //for intersection we use retainAll
        //to check subset .  we use containsAll
        x.retainAll(y);
        System.out.println(x);







    }
}
