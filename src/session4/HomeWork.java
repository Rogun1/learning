package session4;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //1.-----------------------------------
//        String stringOne = "OpenAI";
//        String stringTwo = "OpenAI";
//
//        System.out.println(stringOne == stringTwo);// Reference is pointing to the same thing in memory if values are the same.
//        System.out.println(stringOne.equals(stringTwo));// True , values are the same.



        //2.-----------------------------------
//        int firstNumber = 10;
//        int secondNumber = 5;
//
//        System.out.println(Objects.equals(firstNumber, secondNumber)); // False, because the values are different.
        // I used java.util.Objects because i got an error, maybe because of that "Overwrite" class you used and i didn't.



        //3-----------------------------------
//        int age = 30;
//
//        if (age >= 18){
//            System.out.println("I am an adult");
//        }else {
//            System.out.println("I am not an adult");
//        }



        //4-----------------------------------
//        int heightOne = 170;
//        int heightTwo = 195;
//
//        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
//        System.out.println(maximumHeight);



        //5-----------------------------------
//        for (int i = 0; i <= 10; i++){
//            System.out.println(i);
//            // printing only even numbers
//            if (i % 2 == 0){
//                System.out.println("Even " + i);
//            }
//        }



        //6-----------------------------------
//        int temperature = 15;
//
//        if (temperature >= 30){
//            System.out.println("Hot");
//        } else if (temperature >= 20 && temperature < 30) {
//            System.out.println("Warm");
//        }else {
//            System.out.println("Cold");
//        }



//        //7-----------------------------------
//        int sideOne = 12;
//        int sideTwo = 10;
//        int sideThree = 13;
//
//        String triangleType =
//                (sideOne == sideTwo && sideOne == sideThree && sideTwo == sideThree) ? "Triunghi Echilateral"
//                :(sideOne == sideTwo && sideOne != sideThree) ? "Triunghi Isoscel" :
//                "Triunghi Oarecare";
//
//        System.out.println(triangleType);



        //8-----------------------------------
//        int factorialNumber = 5;
//
//        for (int i = factorialNumber; i != 1; i--){
//            System.out.println("Original " + factorialNumber);
//            factorialNumber *= (i - 1);
//            System.out.println("After Multiply " + factorialNumber);
//        }
//        System.out.println("Final factorial number: " + factorialNumber);



        //9-----------------------------------
//        String countryOne = "USA";
//        String countryTwo = "USA";
//
//        System.out.println(countryOne.equals(countryTwo));
//        countryTwo = "UK";
//        System.out.println(countryOne.equals(countryTwo));



        //10-----------------------------------
//        ArrayList<String> listOne = new ArrayList<String>();
//        listOne.add("numberOne");
//        listOne.add("numberTwo");
//        listOne.add("numberThree");
//
//        ArrayList<String> listTwo = listOne;
//        System.out.println(listOne);
//        System.out.println(listTwo);
//
//        listOne.add(0, "numberFor");
//        System.out.println(listOne);
//        System.out.println(listTwo);
        // listOne has a address, and listTwo is a reference to the listTwo, so is like a copy ? but takes no extra memory?



        //11-----------------------------------
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//
//        int additionalResult;
//        int multiplicationResult;
//
//        additionalResult = a + b;
//        multiplicationResult = c * d;
//
//        System.out.println(additionalResult);
//        System.out.println(multiplicationResult);



        //12-----------------------------------
//        int number = 25;
//        int negativNumber = -number;
//
//        System.out.println(negativNumber);



        //13-----------------------------------
//        boolean isRaining = true;
//        boolean isSunny = false;
//
//        System.out.println(!isRaining);
//        System.out.println(!isSunny);



        //14-----------------------------------
//        int counter = 0;
//        System.out.println(++counter);
//        System.out.println(--counter);



        //15-----------------------------------
//        int total = 100;
//        total -= 20;
//        System.out.println(total);
//        total *= 2;
//        System.out.println(total);



        //16-----------------------------------
//        int number = 50;
//        int negativeNumber = -number;
//        System.out.println(negativeNumber);
//
//        negativeNumber = -(negativeNumber);
//        System.out.println(negativeNumber);
//
//        negativeNumber++;
//        System.out.println(negativeNumber);



        //17-----------------------------------

//        boolean hasUsername = false;
//        boolean hasPassword = true;
//
//        if (hasUsername && hasPassword){
//            System.out.println("Authentication Successful");
//        } else if (hasUsername && !hasPassword) {
//            System.out.println("Password is Incorrect");
//        }else {
//            System.out.println("Authentication False");
//        }



        //18-----------------------------------
//        int[] numbers = new int[5];
//
//        System.out.println("Adding numbers that matches the index");
//        for (int i = 0; i < numbers.length; i++){
//           // System.out.println(i);
//            numbers[i] = i + 1;
//            System.out.print(" " + numbers[i]);
//        }
//        System.out.println("");
//        System.out.println("Numbers after loop");
//
//        for (int number : numbers){
//            System.out.print(" " + number);
//        }
//        System.out.println("");
//        System.out.println("Adding numbers that matches the index in reverse");
//
//        for (int i = numbers.length - 1; i >= 0; i--){
//            //System.out.print(i);
//            numbers[i] = numbers.length - i;
//            System.out.print(" " + numbers[i]);// Nu stiu cum sa il fac sa apara si in loop cu numerele invers.
//        }
//        System.out.println("");
//        System.out.println("Numbers after decrement loop");
//
//        for (int number : numbers){
//            System.out.print(" " + number);
//        }



        //19-----------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ce varsta ai?: ");
//        int age = scanner.nextInt();
//        System.out.println(age);
//
//        String personAge = (age < 12)? "Child"
//                :(age >= 12 && age <= 17)? "Teenager"
//                :(age >= 18 && age <= 64)? "Adult"
//                : "Senior";
//        System.out.println(personAge);



        //20-----------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("(A) Primul numar: ");
//        int a = scanner.nextInt();
//        System.out.print("(B) Al doilea numar: ");
//        int b = scanner.nextInt();
//        System.out.print("(C) Al treilea numar: ");
//        int c = scanner.nextInt();
//
//        String largestNumber = (a > b && a > c)? "A este mai mare"
//                :(b > a && b > c)? "B este mai mare"
//                :(c > a && c > b)? "C este mai mare"
//                :"Sunt egale";
//        System.out.println(largestNumber);



        //21-----------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Adauga scor: ");
//        double score = scanner.nextDouble();
//
//        String studentScore = (score >= 90 && score <= 100)? "A"
//                :(score >= 80 && score <= 89)? "B"
//                :(score >= 70 && score <= 79)? "C"
//                :(score >= 60 && score <= 69)? "D"
//                :"F";
//        System.out.println(studentScore);
    }
}
