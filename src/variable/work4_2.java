package variable;
import java.util.Scanner;
public class work4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число a: ");
        Scanner input = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");

        int b = scanner.nextInt();
        System.out.println("Введите число c: ");

        int c = scanner.nextInt();


        if ((a - b) * (c - a) >= 0) {              // a >= b and a <= c OR a <= b and a >= c
            System.out.print(a);
        } else if ((b - a) * (c - b) >= 0) {       // b >= a and b <= c OR b <= a and b >= c
            System.out.print(b);
        } else {
            System.out.print("среднее из трёх чисел =" + c);
        }
    }
}