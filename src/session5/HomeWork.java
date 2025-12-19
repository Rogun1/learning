package session5;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 ------------------------------------
//
//        System.out.print("Scrie un numar: ");
//        int number = scanner.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }


        //2 ------------------------------------
//        System.out.println("Write a number between 1-12: ");
//        int month = scanner.nextInt();
//
//        switch (month){
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("Jun");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("September");
//            case 10 -> System.out.println("October");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//            default -> System.out.println("Invalid Month");
//        }


        //3 ------------------------------------
//        int[] numbers = {1, 3, 4, -1, 10, -12, 0, -99};
//
//        for (int number: numbers){
//            if (number >= 0){
//                continue;
//            }
//            System.out.println(number);
//        };


        //4 ------------------------------------
//        System.out.print("Write something: ");
//        String inputText = scanner.next();
//        String reversedInputText = "";
//
//        for (int i = 0; i < inputText.length(); i++){
//            reversedInputText = inputText.charAt(i) + reversedInputText;
//        }
//        System.out.println(reversedInputText);


        //5 ------------------------------------
//        int a = 0;
//        int b = 1;
//        System.out.println("Adauga un numar pentru seria fibonacci: ");
//        int nNumber = scanner.nextInt();
//        int[] series = new int[nNumber];
//        series[0] = a;
//        series[1] = b;
//
//        for (int i = 2; i < series.length; i++){
//            System.out.println();
//            series[i] = series[i - 1] + series[i - 2];
//
//            for (int num: series){
//                System.out.print(num + "");
//            }
//        }

        //************ AM STAT 2 ORE SA FAC EXERCITIU 5 🤣

        //6 ------------------------------------
//        int numberAdded = 0;
//        while (true){
//            System.out.println("Add number: ");
//            int numberToAdd = scanner.nextInt();
//            if (numberToAdd == -1){
//                break;
//            }
//            numberAdded += numberToAdd;
//            System.out.println(numberAdded);
//        }
//        System.out.println(numberAdded);



        //7 ------------------------------------
//        int numberToGuess = 5;
//        boolean guess = false;
//
//        do {
//            System.out.println("Guess the number: ");
//            int numberGuessed = scanner.nextInt();
//            if (numberGuessed == 5){
//                guess = true;
//            } else if (numberGuessed < numberToGuess) {
//                System.out.println("Number too low");
//            }else {
//                System.out.println("Number too high");
//            }
//        }while (!guess);{
//            System.out.println("You guessed the number");
//        }


        //8 ------------------------------------
//        int[] fibonacciSeries = {0, 1, 1, 2, 3, 5, 8, 13, 21};
//
//        for (int i = 0; i < fibonacciSeries.length; i++){
//            System.out.print(" " + fibonacciSeries[i]);
//        }


        //9 ------------------------------------
//        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21};
//
//        for (int num: numbers){
//            if (num % 2 == 0){
//                System.out.println("Even: " + num);
//            } else if (num % 2 == 1) {
//                System.out.println("Odd: " + num);
//            }
//        }



        //10 ------------------------------------

//        menu: while(true){
//            System.out.println("1. Print 'Hello World'");
//            System.out.println("2. Print your Name");
//            System.out.println("3. Exit");
//            int choose = scanner.nextInt();
//
//            switch (choose){
//                case 1 -> System.out.println("Hello World");
//                case 2 -> System.out.println("Your name is Raul");
//                case 3 -> {
//                    System.out.println("Hai pa");
//                    break menu;
//                }
//                default -> System.out.println("Invalid Choice");
//            }
//
//        }


        //11 ------------------------------------

//        int numbers = 0;
//        int numbersAdded = 0;
//        while (true){
//            System.out.println("Enter number: ");
//            int numberEntered = scanner.nextInt();
//            if (numberEntered == 0){
//                int result = numbers / numbersAdded;
//                System.out.println("Sum of numbers: " + numbers);
//                System.out.println("Numbers Added: " + numbersAdded);
//                System.out.println("Avarage number is: " + result);
//                break;
//            }
//            numbers += numberEntered;
//            numbersAdded++;
//            System.out.println("Numbers added " + numbersAdded);
//        }


        //12 ------------------------------------

//        int maxNumbers = 10;
//        int numbers = 0;
//        int totalAdded = 0;
//
////        while (totalAdded <= maxNumbers){
////            System.out.println("Add a number: ");
////            int numberAdded = scanner.nextInt();
////            totalAdded++;
////            if (numberAdded > 5){
////                numbers += numberAdded;
////                System.out.println(numbers);
////            }
////        }
//
//        for (int i = 0; i <= 10; i++){
//            System.out.println("Add a number: ");
//            int numberAdded = scanner.nextInt();
//            if (numberAdded <= 5){
//                continue;
//            }
//            numbers += numberAdded;
//            System.out.println(numbers);
//        }



        //13 ------------------------------------ NU STIU SA FAC

//        char[][] maze = {
//                {'S','1','0','1'},
//                {'0','1','0','1'},
//                {'0','1','0','1'},
//                {'1','0','0','E'}
//};
//
  }
}
