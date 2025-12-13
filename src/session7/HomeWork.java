package session7;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeWork {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //displayTodayDate();
        //displayDateComponents(LocalDate.now());
        //createSpecificDate();
        //areDatesEqual();
        //isTodaySpecificDate();
        //displayCurrentTime();
        //addWeeksToToday(2);
        //findDayOfWeek(LocalDate.of(2024,8,19));
        //daysBetween();
        //isValidDate();
        //elapsedTimeSince();
    }

    public static void displayTodayDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
    public static void displayDateComponents(LocalDate date){
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());
    }
    public static void createSpecificDate(){
        System.out.println(LocalDate.of(2025,8,19));
    }
    public static void areDatesEqual(){
        System.out.println("Add dates in this format YYYY-MM-DD");
        System.out.print("Add first date: ");
        LocalDate date1 = LocalDate.parse(scanner.next());
        System.out.print("Add second date: ");
        LocalDate date2 = LocalDate.parse(scanner.next());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        boolean result = (date1.equals(date2));
        System.out.println(result);
    }
    public static void isTodaySpecificDate(){
        LocalDate date = LocalDate.now();
        LocalDate dateToCheck = LocalDate.parse("2019-12-19");
        System.out.println(date.equals(dateToCheck));
    }
    public static void displayCurrentTime(){
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
    public static void addWeeksToToday(int weeksToAdd){
        LocalDate date = LocalDate.now();
        System.out.println(date.plusWeeks(weeksToAdd));
    }
    public static void findDayOfWeek(LocalDate date){
        System.out.println(date.getDayOfWeek());
    }
    public static void daysBetween(){
        System.out.println("Add dates in this format YYYY-MM-DD");
        System.out.print("Add first date: ");
        LocalDate date1 = LocalDate.parse(scanner.next());
        System.out.print("Add second date: ");
        LocalDate date2 = LocalDate.parse(scanner.next());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        int result = date1.getDayOfMonth() - date2.getDayOfMonth();
        System.out.println("Difference of " + result + " days.");
    }
    public static void isValidDate(){
        System.out.print("Add a date: ");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean dateIsValid = true;

        if (date.length() == 10){
            CHAR_SET:if (date.charAt(4) == '-' && date.charAt(7) == '-'){
                String year = date.substring(0, 4);
                //System.out.println(year);
                for (int i = 0; i < year.length(); i++){
                    if (!Character.isDigit(year.charAt(i))){
                        //System.out.println("Invalid year");
                        System.out.println(dateIsValid = false);
                        break CHAR_SET;
                    }
                }
                String month = date.substring(5, 7);
                //System.out.println(month);
                for (int i = 0; i < month.length(); i++){
                    if (!Character.isDigit(month.charAt(i))){
                        //System.out.println("Invalid month");
                        System.out.println(dateIsValid = false);
                        break CHAR_SET;
                    }
                }
                String day = date.substring(8, 10);
                //System.out.println(day);
                for (int i = 0; i < day.length(); i++){
                    if (!Character.isDigit(day.charAt(i))){
                        //System.out.println("Invalid day");
                        System.out.println(dateIsValid = false);
                        break CHAR_SET;
                    }
                }

                LocalDate parse = LocalDate.parse(date, formatter);
                //System.out.println(parse);
                System.out.println(dateIsValid);

            }
            else {
                //System.out.println("Invalid Date 2");
                System.out.println(dateIsValid = false);
            }
        }else{
            //System.out.println("Invalid Date.");
            System.out.println(dateIsValid = false);
        }
    }
    public static void elapsedTimeSince(){
        System.out.print("Add a time as HH:mm:ss : ");
        String time = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parse = LocalTime.parse(time,formatter);
        System.out.println(time);

        LocalTime localtime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(localtime.format(timeFormatter));

        int hours = localtime.getHour() - parse.getHour();
        int minutes = localtime.getMinute() - parse.getMinute();
        int seconds = localtime.getSecond() - parse.getSecond();
        System.out.println("The time span given as " + hours + " hours," + minutes + " minutes," + seconds + " seconds.");
         //System.out.println(parse.getClass());

    }
}
