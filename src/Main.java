public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 2
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 3
        for (int i = 0; i % 2 == 0 && i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 4
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 7
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        { // Задача 8
            int savings = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + savings;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
            System.out.println(total);
            System.out.println();
            System.out.println();
            System.out.println();
        }

        // Задача 9
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей!");
        }
        System.out.println(total);
        System.out.println();
        System.out.println();
        System.out.println();


        // Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}