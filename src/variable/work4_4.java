package variable;
import java.util.Scanner;
public class work4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число килобайт: ");
        Scanner input = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a * 1024;
        System.out.println("столько байт в одном килобайте " + b);
     }
}
