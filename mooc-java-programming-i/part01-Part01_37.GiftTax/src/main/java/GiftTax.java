
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftPrice = Integer.valueOf(scan.nextLine());

        if (giftPrice > 1_000_000) {
            System.out.println("Tax: " + (142_100 + (giftPrice - 1_000_000) * 0.17));
        } else if (giftPrice >= 200_000 && giftPrice <= 1_000_000) {
            System.out.println("Tax: " + (22_100 + (giftPrice - 200_000) * 0.15));
        } else if (giftPrice >= 55_000 && giftPrice <= 200_000) {
            System.out.println("Tax: " + (4_700 + (giftPrice - 55_000) * 0.12));
        } else if (giftPrice >= 25_000 && giftPrice <= 55_000) {
            System.out.println("Tax: " + (1_700 + (giftPrice - 25_000) * 0.10));
        } else if (giftPrice >= 5_000 && giftPrice <= 25_000) {
            System.out.println("Tax: " + (100 + (giftPrice - 5_000) * 0.08));
        } else {
            System.out.println("No tax!");
        }
    }
}
