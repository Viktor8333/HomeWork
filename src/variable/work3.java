package variable;

public class work3 {
    public static void main(String[] args) {
        int x = 555;
        int y = 111;
        int c = Math.subtractExact(x, y);//Возвращает разницу аргументов
        System.out.println(c);

        int e = Math.multiplyExact( x,  y);// Возвращает произведение аргументов
        System.out.println(e);
        double h = 120;
        double g = Math.pow(h, y);//Возвращает значение первого аргумента, возведенное в степень второго аргумента.
        System.out.println(g);
    }
}
