package variable;

import java.util.Scanner;

public class work4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число a: ");
        Scanner input = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
            if ( a % b == 0 )
            System.out.println("число делиться");
        else
            System.out.println("Число число без остатка не делиться");
    }
}
