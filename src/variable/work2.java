package variable;

public class work2 {
    public static void main(String[] args) {
      int a = 5;
      int b = 2;
      int c = 8;
        int d1 = a + b / c; // первым действием будет деление; 0+5=5;
            System.out.println(d1);

        int d2 = (a + b) / c; // целая часть от деления 7/8=0;
            System.out.println(d2);

        int d3 = (a + b++) / c; //т.к. 2 занесено в переменную, результат будет 0.
            System.out.println(d3);// (5+2)/8=0 т.к. ++ стоит после b.
                b -= 1;
        int d4 = (a + b++) / c--; // (5+2)/7=1.
            System.out.println(d4);
             b -= 1;
             c += 1;
        int d5 = (a * b >> b++) / --c;// умножение.В двоичной ситеме два знака в право.2/7=0
            System.out.println(d5);
            b -= 1;
            c += 1;
         int d6 = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --c;// выполнит второе условие и разделит на 7.
            System.out.println(d6);
                        // в примере 7 будет ошибка, неверный оператор.
          boolean d8 = 6 - 2 > 3 && 12 * 12 <= 119;// два результата должны быть истинны. False
            System.out.println(d8);
           boolean d9 = true && false;// false, одно из условий неверно.
            System.out.println(d9);

}
}
