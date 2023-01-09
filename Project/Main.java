// Wair BullSh*t Code

import java.util.Scanner;

public class Main {

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор подсчёта круток для гашни!\n" +
                "Для более точного подсчёта ваших круток, ответьте на пару вопросов");
        wait(2000);
        start();
    }
    
    private static void start() {
        Scanner scan = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("У вас есть луна? (y/n)");
        String a = scan.nextLine();

        System.out.println("Вы будете выполнять дейлики? (y/n)");
        String b = scan.nextLine();

        System.out.println("Сколько дней до нужного баннера? (Введите число)");
        int c = scan.nextInt();

        System.out.println("Сколько у вас УЖЕ есть гемов? (Введите число)");
        int d = scan.nextInt();

        System.out.println("Сколько круток у вас имеется? (Введите число)");
        int e = scan.nextInt();

        System.out.println("Считаем...");
        wait(2000);

        if ( a.equals("y") && b.equals("y") ) {
            float result1 = ( ( 90 + 60 ) * c + ( d + ( e * 160 ) ) ) / 160f;
            System.out.println("Вот столько круток будет к выходу баннера: " + Math.round(result1));
        }else if ( a.equals("y") && b.equals("n") ) {
            float result1 = ( 90 * c + ( d + ( e * 160 ) ) ) / 160f;
            System.out.println("Вот столько круток будет к выходу баннера: " + Math.round(result1));
        }else if ( a.equals("n") && b.equals("y") ) {
            float result1 = ( 60 * c + (d + (e * 160))) / 160f;
            System.out.println("Вот столько круток будет к выходу баннера: " + Math.round(result1));
        }else if ( a.equals("n") && b.equals("n") )  {
            float result1 = ( c + (d + (e * 160))) / 160f;
            System.out.println("Вот столько круток будет к выходу баннера: " + Math.round(result1));
        }else {
            System.out.println("Вы ввели неверные данные! Программа не может заработать дальше.");
            //System.exit(0);
        }
        wait(1000);
        repeat();
    }

    private static void repeat() {
        Scanner test = new Scanner(System.in);

        System.out.println("Хотите продолжить работу? (y/n)");
        String f = test.nextLine();

        if ( f.equals ("y") ) {
            System.out.println("Обнуляем подсчёты...");
            wait(2000);
            start();
        } else {
            System.out.println("Всего хорошего!");
            wait(1000);
            System.exit(0);

        }
    }
}
