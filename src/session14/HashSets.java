package session14;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSets {
    static void main(String[] args) {
        HashSet<String> num = new HashSet<String>();
        num.add("One");
        num.add("Two");
        num.add("Three");
        num.add("For");
        System.out.println(num);
        System.out.println(num.size());
        //num.clear();
        System.out.println(num);
        System.out.println(num.isEmpty());
        HashSet<String> num2 = new HashSet<>();
        num2 = (HashSet<String>) num.clone();
        System.out.println(num2);
        num2.toArray();
        if (num.equals(num2)){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
        num2.clear();
        System.out.println(num2);
    }
}
