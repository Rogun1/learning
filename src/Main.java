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

        System.out.println("Test Branch");
        System.out.println("Test Branch2");
        System.out.println("Now i am making a change in feature-branch");


        System.out.println("Testing again to understand");
        System.out.println("One more test, i am on main doing this2");
    }
}
