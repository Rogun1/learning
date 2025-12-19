package session6;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkMediumLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
//        System.out.println("Cautam ana sa schimbana aici.");
//        String text = "Cautam ana sa schimbana aici.";
//        String target = "ana";
//        String replacement = "raul";
//        StringBuilder result = new StringBuilder("");
//
//        for (int i = 0; i < text.length(); i++){
//            if (text.charAt(i) == target.charAt(0)){
//                boolean match = true;
//                for (int j = 0; j<target.length(); j++){
//                    if (i + j > text.length() || text.charAt(i + j) != target.charAt(j)) {
//                        match = false;
//                        break;
//                    }
//                }
//                if (match) {
//                    result.append(replacement);
//                    i += target.length() - 1;
//                }else{
//                    result.append(text.charAt(i));
//                }
//            }else {
//                result.append(text.charAt(i));
//            }
//        }
//        System.out.println(result);


        //2
//        StringBuilder text = new StringBuilder("SOME DOME COME") ;
//        StringBuilder result = new StringBuilder("");
//        System.out.println(text);
//
//        for (int i = 0; i < text.length(); i++){
//            boolean match = false;
//            for (int j = i + 1; j < text.length(); j++){
//                if (text.charAt(i) == text.charAt(j)) {
//                    text.deleteCharAt(j);
//                    match = true;
//                    break;
//                }
//            }
//            if (match){
//                result.append(text.charAt(i));
//            }else {
//                result.append(text.charAt(i));
//            }
//        }
//        System.out.println(result);

        //3
//        StringBuilder text = new StringBuilder("Something");
//        String text2 = "Text to add at index";
//
//        text.insert(1, text2);
//        System.out.println(text);


        //4
//        String text = new StringBuilder("Some more text here").toString();
//        StringBuilder chars = new StringBuilder();
//
//        for (int i = 0; i < text.length(); i++){
//            int count = 1;
//
//            if (chars.toString().contains(String.valueOf(text.charAt(i)))){
//                continue;
//            }else{
//                chars.append(text.charAt(i));
//            }
//
//            for (int j = i + 1; j < text.length(); j++){
//                if (text.charAt(i) == text.charAt(j)){
//                    count++;
//                    //System.out.println("Litera: " + text.charAt(i) + " este de " + count++);
//                }
//            }
//            System.out.println("Litera " + text.charAt(i) + " este in text de " + count);
//            count = 0;
//        }
//        System.out.println(chars);

    }
}
