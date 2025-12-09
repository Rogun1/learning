package session6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWorkBeginnerLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
//        System.out.print("Add something: ");
//        StringBuilder someTextToReverse = new StringBuilder(scanner.next());
//
//        System.out.println(someTextToReverse.reverse());


        //2
//        System.out.println("Add the word to check if is a pallindrome: ");
//        String textToCheck = scanner.next();
//        String textToCheckReversed = new StringBuilder(textToCheck).reverse().toString();
//
//        String result = (textToCheck.equalsIgnoreCase(textToCheckReversed))?
//                "The word is a pallindrome"
//                :"The word is not a pallindrome";
//
//        System.out.println(result);


        //3
//        System.out.println("Add text: ");
//        StringBuilder text1 = new StringBuilder(scanner.next());
//        System.out.println("Add more text: ");
//        StringBuilder text2 = new StringBuilder(scanner.next());
//        System.out.println("Add some more text: ");
//        StringBuilder text3 = new StringBuilder(scanner.next());
//
//        System.out.println(text1.append(" " + text2.append(" " + text3)));


        //4
//        StringBuilder vawels = new StringBuilder("aeiou");
//        System.out.println("Add text: ");
//        StringBuilder text = new StringBuilder(scanner.nextLine().toLowerCase());
//        StringBuilder textWithoutVawels = new StringBuilder("");
//
//        for (int  i = 0; i < text.length(); i++){

//            if (vawels.toString().contains(String.valueOf(text.charAt(i)))){
//                continue;
//            }else {
//                textWithoutVawels.append(text.charAt(i));
//            }
//        }
//        System.out.println(textWithoutVawels);


        //5
//        System.out.println("Write your text: ");
//        StringBuilder text = new StringBuilder(scanner.nextLine());
//        StringBuilder textFirstLetterCapitalize = new StringBuilder();
//        boolean space = false;
//
//        for (int i = 0; i < text.length(); i++){
//            if (i == 0){
//                textFirstLetterCapitalize.append(text.toString().toUpperCase().charAt(i));
//            }else if (text.charAt(i) == ' ') {
//                textFirstLetterCapitalize.append(text.toString().charAt(i));
//                space = true;
//            }else if (space){
//                textFirstLetterCapitalize.append(text.toString().toUpperCase().charAt(i));
//                space = false;
//            }else {
//                textFirstLetterCapitalize.append(text.toString().charAt(i));
//            }
//        }
//        //System.out.println(text);
//        System.out.println(textFirstLetterCapitalize);
    }
}
