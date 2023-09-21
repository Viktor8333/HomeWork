package variable;
import java.util.Scanner;
public class work4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        if ((year > 1582) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))){
            System.out.println("The year " + year + "  leap year.");
        } else {
            System.out.println("The year " + year + "  not-leap year.");
        }
    }
}
