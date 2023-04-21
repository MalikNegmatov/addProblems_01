public class Main {

    public static void main(String[] args) {

//      Задачи по ссылке https://skyengpublic.notion.site/1-2-070c491064914f4b8608fa55a3424472
//      Решения ниже в методах 1.n.m Здесь тесты и проверка.

        System.out.println("\nЗадача №1.2.6");
        task1_2_6(); // Задача 6 из раздела 1.2 Переменные доп.задачи

        System.out.println("\nЗадача №1.2.7");
        task1_2_7(5,7);   // Задача 7 из раздела 1.2. На вход числа 5 и 7
        task1_2_7(12,87); //  На вход числа 12 и 87

        System.out.println("\nЗадача №1.2.8");
        task1_2_8(256); // Задача 8 из раздела 1.2. На вход трехзначное число 256
        task1_2_8(789); // На вход число 789

// -------------------------------------------------------------------------------
        System.out.println("\nЗадача №1.3.6");
// Задача 6 из раздела 1.3 с различными данными (age, salary) на входе
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +
                task1_3_6(19,58000) + " рублей");

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +
                task1_3_6(29,93999) + " рублей");

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +
                task1_3_6(45,123456) + " рублей");
// -------------------------------------------------------------------------------
        System.out.println("\nЗадача №1.3.7");
// Задача 7 из раздела 1.3 с различными данными (age, salary, wantedSum) на входе
        task1_3_7(25,60000,330000);
        task1_3_7(26,90000,494000);
        task1_3_7(35,90000,494000);
// -------------------------------------------------------------------------------
        System.out.println("\nЗадача №1.4.4");
        task1_4_4(3,5,30);
        task1_4_4(3,7,100);
// -------------------------------------------------------------------------------
        System.out.println("\nЗадача №1.4.5");
        task1_4_5(10); System.out.println();
        task1_4_5(20); System.out.println();
    }

    public static void task1_2_6() { // Задача 6 из раздела 1.2
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        result *= -1;
        System.out.println(result);
    }

    public static void task1_2_7(int a, int b) { // Задача 7 из раздела 1.2
        System.out.println(a + " " + b );
        a += b;
        b  = a - b;
        a -= b;
        System.out.println(a + " " + b );
    }

    public static void task1_2_8 (int a) { // Задача 8 из раздела 1.2
        System.out.print("средняя цифра числа " + a +  " это: ");
        a = a/10;
        System.out.println((a % 10));
    }

    public static double task1_3_6 (int age, int salary) { // Задача 6 из раздела 1.3
        if (age < 23) {
            if (salary < 50000) {
                return 2 * salary;}
            else if (salary < 80000) {
                return 1.2 * 2 * salary; }
            else {
                return 1.5 * 2 * salary; }
        }
        else {
            if (salary < 50000) {
                return 3 * salary;}
            else if (salary < 80000) {
                return 1.2 * 3 * salary; }
            else {
                return 1.5 * 3 * salary; }
        }
    }


    public static void task1_3_7 (int age, int salary, int wantedSum) { // Задача 7 из раздела 1.3
        double rate = 1.10; // процентная ставка 1 + n/100, n - заданный процент

        boolean salaryLimit = ( salary < 80000 ); // проверяем зарплату
        boolean firstAgeLimit = ( age < 23 ); // проверяем возраст первого ограничения
        boolean secondAgeLimit = ( ( age >= 23 ) && ( age < 30 )); // проверяем возраст второго ограничения

        if (!salaryLimit) {  // Подсчёт процентной ставки в зависимости от зп и возраста
            rate -= 0.007;
        }
        if (firstAgeLimit) {
            rate += 0.01; }
        else if (secondAgeLimit) {
            rate += 0.005 ; }

        int limitCredit = salary/2; // Предел максимально возможного ежем.взноса
        double creditPayment = wantedSum*rate/12; // Платеж по кредиту с ставкой конкретного клиента
        String creditPaymentFormatted = String.format("%8.2f", creditPayment);

        if (creditPayment<=limitCredit) {
            System.out.println("Максимальный платеж при ЗП " + salary +
                    " равен " + limitCredit + " рублей. Платеж по кредиту " + creditPaymentFormatted + " рублей. Одобрено");
        }
        else {
            System.out.println("Максимальный платеж при ЗП " + salary +
                    " равен " + limitCredit + " рублей. Платеж по кредиту " + creditPaymentFormatted + " рублей. Отказано");
        }
    }
    public static void task1_4_4 (int p, int q, int n) { // Задача 4 из раздела 1.4
//  p,q - простые числа  для проверки на кратность чисел в последовательности от 1 до n
        String strOutput;
        for (int i = 1; i <= n; i++) {
            strOutput = i + " ";
            if (i % p == 0) {
                strOutput += "ping ";
            }
            if (i % q == 0) {
                strOutput += "pong ";
            }
            System.out.println(strOutput);
        }
    }
    public static void task1_4_5 (int n) { // задача 5 из раздела 1.4
//  Печать первых n>=2 чисел Фибоначчи
        int f = 0;
        System.out.print(f);
        int f_next = 1;
        System.out.print(" " + f_next);
        for (int i = 3; i <= n; i++) {
            f_next += f ;
            f = f_next - f;
            System.out.print(" " + f_next);
        }
    }
}