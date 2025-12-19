package session8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        //shoppingList();
        //wishList();
        //arraysSomething();
        //evenOrOdd();
        //cityName();
        //studentNames();
        //fruits();
        //movies();
        //binaryConvert();
        diaryProgram();
    }

    public static void shoppingList(){
        String[] shopList = {"T-shirt", "Pants", "Jacket"};

        System.out.println(Arrays.toString(shopList));
    }
    public static void wishList(){
        List<String> wishis = new ArrayList<>(Arrays.asList("T-shirt", "Pants", "Jacket"));
        System.out.println(wishis);
    }
    public static void arraysSomething(){
        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList = new ArrayList<>();

        studentList.add("Mircea");
        studentList.add("Florin");
        studentList.add("Matei");
        studentList.add("Mirel");
        studentList.add("Alin");
        studentList.add("Cornel");
        studentList.add("Miguel");
        studentList.add("Florentin");
        studentList.add("Cartabos");
        studentList.add("Cozonac");

        graduateStudentList.add(String.valueOf(studentList));
        //System.out.println(graduateStudentList.size());
        for (String student: graduateStudentList){
            System.out.println(student);
        }

    }
    public static void evenOrOdd(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,121,245};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        int even = 0;
        int odd = 0;
        for (int num: numbers){
            if (num % 2 == 0){
                System.out.println("Even");
                System.out.println(num);
                even++;
            } else {
                System.out.println("Odd");
                System.out.println(num);
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
    public static void cityName(){
        List<String> citys = new ArrayList<>(Arrays.asList("Bucuresti","Timisoara", "Iasi", "New York", "Koln"));
        Scanner scanner = new Scanner(System.in);
        String cityInput = scanner.next();
        String lowerCase = citys.toString().toLowerCase();

        if (lowerCase.contains(cityInput)){
            System.out.println("Is duplicate.");
        }else {
            citys.add(cityInput);
        }
        System.out.println(citys);
    }
    public static void studentNames(){
        List<String> students = new LinkedList<>();
        students.add("Mircea");
        students.add("Alina");
        students.add("Iolinda");
        String studentName = "Alina";

        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(students);
        }else {
            students.add(studentName);
            System.out.println(students);
        }
        System.out.println(students);

    }
    public static void fruits(){
        ArrayList<String> fruitsNames = new ArrayList<>();
        fruitsNames.add("Apple");
        fruitsNames.add("PineApple");
        fruitsNames.add("Orange");
        fruitsNames.add("Banana");
        fruitsNames.add("Cirasa");

        //Collections.sort(fruitsNames);
        Collections.sort(
                fruitsNames,
                Comparator.comparingInt(String::length).reversed()
                        .thenComparing(String::compareToIgnoreCase)
        );
        System.out.println(fruitsNames);
    }
    public static void movies(){
        List<String> moviesTitle = new ArrayList<>();
        moviesTitle.add("Apocalipso");
        moviesTitle.add("Movie");
        moviesTitle.add("AltMovie");
        moviesTitle.add("CevaAltceav");
        String movieCheck = "Nu e";

        for (String movie : moviesTitle) {
            if (movie.equals(movieCheck)){
                System.out.println(moviesTitle.indexOf(movie));
            }
        }
    }
    public static void binaryConvert(){
        String number = "1011";
        Integer numToInt = Integer.parseInt(number, 2);

        System.out.println(numToInt);
    }

    public static void diaryProgram(){
        boolean openMenu = true;
        List<String> diary = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //diary.add("2025-06-18: Something to start with");
        diaryMenu();
        
        do {
            int choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Add a new Diary.");
                System.out.println("Add date in format (yyyy-MM-dd):");
                Scanner scanner1 = new Scanner(System.in);
                String dateDiary = scanner1.nextLine();
                System.out.println("Add diary:");
                String diaryToAdd = scanner1.nextLine();

                if (!isValidDate(dateDiary)){
                    System.out.println("Invalid date");
                    printDiarySpaceAndMenu();
                } else {
                    boolean dateExisting = true;

                    for (String item: diary){
                        if (item.contains(dateDiary)){
                            dateExisting = false;
                            break;
                        }
                    }

                    if (dateExisting){
                        diary.add(dateDiary + ": " + diaryToAdd);
                        System.out.println(diary);
                        printDiarySpaceAndMenu();
                    }else {
                        System.out.println("Diary already exist at date: " + dateDiary);
                        printDiarySpaceAndMenu();
                    }
                }

            } else if (choice == 2){
                System.out.println("Add date to edit diary");
                Scanner scanner1 = new Scanner(System.in);
                String dateDiary = scanner1.next();
                boolean editedDiary = false;

                for (String item: diary){
                    if (item.contains(dateDiary)){
                        System.out.println("Add modified diary.");
                        Scanner scanner2 = new Scanner(System.in);
                        String modifyDiary = scanner2.nextLine();
                        diary.set(diary.indexOf(item), dateDiary + ": " + modifyDiary);
                        editedDiary = true;
                        break;
                    }
                }
                if (editedDiary){
                    System.out.println(diary);
                    printDiarySpaceAndMenu();
                }else {
                    System.out.println("Date " + dateDiary + " doesn't exist.");
                    printDiarySpaceAndMenu();
                }


            } else if (choice == 3) {
                System.out.println("Add date to delete in diary");
                Scanner scanner3 = new Scanner(System.in);
                String dateDiary = scanner3.next();
                boolean deletedDiary = false;

                for (String item: diary){
                    if (item.contains(dateDiary)){
                        diary.remove(diary.indexOf(item));
                        deletedDiary = true;
                        break;
                    }
                }

                if (deletedDiary){
                    System.out.println("You deleted the diary at date " + dateDiary);
                    System.out.println(diary);
                    printDiarySpaceAndMenu();
                }else {
                    System.out.println("No such date exist in diary " + dateDiary);
                    System.out.println(diary);
                    printDiarySpaceAndMenu();
                }

            } else if (choice == 4) {
                Collections.reverse(diary);
                System.out.println(diary);
                printDiarySpaceAndMenu();
            } else if (choice == 5){
                openMenu = false;
            } else {
                diaryMenu();
            }
        }while (openMenu);
    }
    public static void diaryMenu(){
        System.out.println("Choose something from the menu");
        System.out.println("1. Add new thing in diary.");
        System.out.println("2. Edit an existing diary by date.");
        System.out.println("3. Delete an existing diary by date.");
        System.out.println("4. Display all entries by chronological order.");
        System.out.println("5. Exit menu.");
        System.out.println("Diary List :");
        System.out.print("Choose: ");
    }
    public static boolean isValidDate(String date){
        boolean dateIsValid = true;

        if (date.length() == 10){
            CHAR_SET:if (date.charAt(4) == '-' && date.charAt(7) == '-'){
                String year = date.substring(0, 4);
                for (int i = 0; i < year.length(); i++){
                    if (!Character.isDigit(year.charAt(i))){
                        dateIsValid = false;
                        break CHAR_SET;
                    }
                }
                String month = date.substring(5, 7);
                for (int i = 0; i < month.length(); i++){
                    if (!Character.isDigit(month.charAt(i))){
                        dateIsValid = false;
                        break CHAR_SET;
                    }
                }
                String day = date.substring(8, 10);
                for (int i = 0; i < day.length(); i++){
                    if (!Character.isDigit(day.charAt(i))){
                        dateIsValid = false;
                        break CHAR_SET;
                    }
                }
            }
            else {
                dateIsValid = false;
            }
        }else{
            dateIsValid = false;
        }
        return dateIsValid;
    }
    public static void printDiarySpaceAndMenu(){
        System.out.println();
        diaryMenu();
    }
}
