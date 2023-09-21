package variable;
import java.util.Scanner;
public class work4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        char symbol = (char) a;
        if ((a > 64 && a < 91) || (a > 96 && a < 123)) {
            System.out.printf("Число %d, обозначающее код аглийской буквы %c по таблице ASCII", a, symbol);
        } else {
            System.out.printf("Число %d, обозначающее код символ %c по таблице ASCII", a, symbol);
        }
    }
}
