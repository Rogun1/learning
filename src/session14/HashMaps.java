package session14;

import java.util.HashMap;

public class HashMaps {
    static void main(String[] args) {
        HashMap<Integer, String> errors = new HashMap<>();
        errors.put(404,"Error 404");
        errors.put(400,"Error 400");
        errors.put(401,"Error 401");

        System.out.println(errors.get(404));
        System.out.println(errors.size());
        System.out.println(errors);
        //errors.clear();
        System.out.println(errors);
        if (errors.containsKey(404)){
            System.out.println("It does");
        }else {
            System.out.println("It does not");
        }

        errors.put(404,"Some other error");
        System.out.println(errors);
        errors.put(404,"Some other error");
        System.out.println(errors);
        System.out.println(errors.containsKey(404));

        for (Integer error: errors.keySet()){
            String name = errors.get(error);
            System.out.println("Code: " + error + ", error type: " + name);
        }
    }
}
