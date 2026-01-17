package session14;

import java.util.*;

public class ArrayLists {
    static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList());
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        System.out.println(colors);
        System.out.println(colors.isEmpty());

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,8,1,21,31,34));
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(!numbers.isEmpty());

        List<Integer> numbers2 = new LinkedList<>(Arrays.asList(3,1,3,7,1,23,1,3,4,123));
        System.out.println(numbers2);
        Collections.sort(numbers2);
        System.out.println(numbers2);
        Collections.reverse(numbers2);
        System.out.println(numbers2);
        numbers2.addLast(20);
        System.out.println(numbers2);
        numbers2.addFirst(10002);
        System.out.println(numbers2);
        Collections.swap(numbers2,2,4);
        System.out.println(numbers2);
    }
}

