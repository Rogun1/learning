import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         System.out.print("Add your first number:");
        Scanner userX = new Scanner(System.in);
        int x = userX.nextInt();
        System.out.print("Add your second number:");
        Scanner userY = new Scanner(System.in);
        int y = userY.nextInt();

        System.out.println("Addition with your numbers results = " + (x + y));
    }
}
