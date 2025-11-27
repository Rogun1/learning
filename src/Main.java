import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Add Price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Add Discount: ");
        int discount = Integer.parseInt(scanner.nextLine());

        System.out.println("Price before discount: " + price);
        System.out.println("Discount added: " + discount +"%" );

        int discountedPrice = price - ((price * discount) / 100);

        System.out.print("Price with discount applied is: " + discountedPrice);

    }
}
