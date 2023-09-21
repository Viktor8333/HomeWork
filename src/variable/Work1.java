package variable;

import java.util.Scanner;
public class Work1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        if (scanner.hasNextInt()) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int d = a | b; // побитовое или. Если хоть в одном из операндов есть 1, то он будет 1.
            int f = a & b; //побитовое и. Если в одном из операндов есть 0, то будет засчитан 0.


            System.out.println("f=" + f);

            System.out.println("в двоичной системе d=" + Integer.toBinaryString(d));
            System.out.println("в двоичной системе f=" +Integer.toBinaryString(f));
        }
    }
}

