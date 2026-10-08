import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void run() {
        String input;
        System.out.println("Список заданий варианта 9:");
        System.out.println();
        System.out.println("ЗАДАНИЕ 1. Методы:");
        System.out.println("  1.1 - Дробная часть числа");
        System.out.println("  1.2 - Сумма двух последних цифр");
        System.out.println("  1.5 - Проверка на двузначность");
        System.out.println("  1.7 - Попадание числа в диапазон");
        System.out.println("  1.9 - Равенство трёх чисел");
        System.out.println();
        System.out.println("ЗАДАНИЕ 2. Условия:");
        System.out.println("  2.2  - Безопасное деление");
        System.out.println("  2.3  - Делится на 3 или 5 (но не на оба)");
        System.out.println("  2.6  - Тройная сумма");
        System.out.println("  2.8  - Склонение слова год/года/лет");
        System.out.println("  2.10 - Вывод дней недели до конца");
        System.out.println();
        System.out.println("ЗАДАНИЕ 3. Циклы:");
        System.out.println("  3.1  - Числа от 0 до x");
        System.out.println("  3.4  - Возведение в степень");
        System.out.println("  3.5  - Количество цифр в числе");
        System.out.println("  3.7  - Квадрат из звёздочек");
        System.out.println("  3.10 - Игра Угадайка");
        System.out.println();
        System.out.println("ЗАДАНИЕ 4. Массивы:");
        System.out.println("  4.3 - Максимальное по модулю");
        System.out.println("  4.5 - Вставка массива в массив");
        System.out.println("  4.6 - Реверс массива");
        System.out.println("  4.8 - Объединение двух массивов");
        System.out.println("  4.9 - Все вхождения числа");
        System.out.println();
        System.out.println("Формат ввода: задание.задача (например 1.1)");
        System.out.println("0 - выход");
        System.out.println();

        while (true) {
            System.out.print("Введите номер задачи: ");
            input = scanner.nextLine().trim();
            switch (input) {
                case "0":
                    System.out.println("Выход из программы.");
                    return;
                case "1.1":
                    runTask1_1();
                    break;
                case "1.2":
                    runTask1_2();
                    break;
                case "1.5":
                    runTask1_5();
                    break;
                case "1.7":
                    runTask1_7();
                    break;
                case "1.9":
                    runTask1_9();
                    break;
                case "2.2":
                    runTask2_2();
                    break;
                case "2.3":
                    runTask2_3();
                    break;
                case "2.6":
                    runTask2_6();
                    break;
                case "2.8":
                    runTask2_8();
                    break;
                case "2.10":
                    runTask2_10();
                    break;
                case "3.1":
                    runTask3_1();
                    break;
                case "3.4":
                    runTask3_4();
                    break;
                case "3.5":
                    runTask3_5();
                    break;
                case "3.7":
                    runTask3_7();
                    break;
                case "3.10":
                    runTask3_10();
                    break;
                case "4.3":
                    runTask4_3();
                    break;
                case "4.5":
                    runTask4_5();
                    break;
                case "4.6":
                    runTask4_6();
                    break;
                case "4.8":
                    runTask4_8();
                    break;
                case "4.9":
                    runTask4_9();
                    break;
                default:
                    System.out.println("Такой задачи нет! Введите номер из списка или 0 для выхода.");
                    break;
            }
        }
    }

    public double fraction(double x) {
        return x - (int) x;
    }

    public void runTask1_1() {
        System.out.println("--- Задача 1.1: Дробная часть числа ---");
        System.out.print("Введите вещественное число: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Нужно вещественное число.");
            scanner.next();
        }
        double x = scanner.nextDouble();
        System.out.println("Дробная часть: " + fraction(x));
        scanner.nextLine();
        System.out.println();
    }

    public int sumLastNums(int x) {
        x = Math.abs(x);
        int last = x % 10;
        int secondLast = (x / 10) % 10;
        return last + secondLast;
    }

    public void runTask1_2() {
        System.out.println("--- Задача 1.2: Сумма двух последних цифр ---");
        System.out.print("Введите целое число (минимум 2 цифры): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.println("Сумма двух последних цифр: " + sumLastNums(x));
        scanner.nextLine();
        System.out.println();
    }

    public boolean is2Digits(int x) {
        x = Math.abs(x);
        return x >= 10 && x <= 99;
    }

    public void runTask1_5() {
        System.out.println("--- Задача 1.5: Проверка на двузначность ---");
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.println("Число двузначное? " + is2Digits(x));
        scanner.nextLine();
        System.out.println();
    }

    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    public void runTask1_7() {
        System.out.println("--- Задача 1.7: Попадание числа в диапазон ---");
        System.out.print("Введите границу a: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int a = scanner.nextInt();
        System.out.print("Введите границу b: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int b = scanner.nextInt();
        System.out.print("Введите число num: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int num = scanner.nextInt();
        System.out.println("Число " + num + " в диапазоне [" + Math.min(a, b) + "; " + Math.max(a, b) + "]? " + isInRange(a, b, num));
        scanner.nextLine();
        System.out.println();
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public void runTask1_9() {
        System.out.println("--- Задача 1.9: Равенство трёх чисел ---");
        System.out.print("Введите число a: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int b = scanner.nextInt();
        System.out.print("Введите число c: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int c = scanner.nextInt();
        System.out.println("Все три числа равны? " + isEqual(a, b, c));
        scanner.nextLine();
        System.out.println();
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public void runTask2_2() {
        System.out.println("--- Задача 2.2: Безопасное деление ---");
        System.out.print("Введите делимое x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.print("Введите делитель y: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int y = scanner.nextInt();
        System.out.println("Результат деления: " + safeDiv(x, y));
        scanner.nextLine();
        System.out.println();
    }

    public boolean is35(int x) {
        boolean divBy3 = (x % 3 == 0);
        boolean divBy5 = (x % 5 == 0);
        return (divBy3 || divBy5) && !(divBy3 && divBy5);
    }

    public void runTask2_3() {
        System.out.println("--- Задача 2.3: Делится на 3 или 5 (но не на оба) ---");
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.println("Условие выполнено? " + is35(x));
        scanner.nextLine();
        System.out.println();
    }

    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public void runTask2_6() {
        System.out.println("--- Задача 2.6: Тройная сумма ---");
        System.out.print("Введите число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int y = scanner.nextInt();
        System.out.print("Введите число z: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int z = scanner.nextInt();
        System.out.println("Можно получить одно из другого суммой двух? " + sum3(x, y, z));
        scanner.nextLine();
        System.out.println();
    }

    public String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;
        String word;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            word = "лет";
        } else if (lastDigit == 1) {
            word = "год";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            word = "года";
        } else {
            word = "лет";
        }

        return x + " " + word;
    }

    public void runTask2_8() {
        System.out.println("--- Задача 2.8: Склонение слова год/года/лет ---");
        System.out.print("Введите возраст (целое число): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.println("Результат: " + age(x));
        scanner.nextLine();
        System.out.println();
    }

    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    public void runTask2_10() {
        System.out.println("--- Задача 2.10: Вывод дней недели до конца ---");
        System.out.print("Введите день недели с маленькой буквы: ");
        String x = scanner.nextLine().trim();
        System.out.println("Дни до конца недели:");
        printDays(x);
        System.out.println();
    }

    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    public void runTask3_1() {
        System.out.println("--- Задача 3.1: Числа от 0 до x ---");
        System.out.print("Введите целое число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.println("Результат: \"" + listNums(x) + "\"");
        scanner.nextLine();
        System.out.println();
    }

    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public void runTask3_4() {
        System.out.println("--- Задача 3.4: Возведение в степень ---");
        System.out.print("Введите основание x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.print("Введите показатель степени y: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int y = scanner.nextInt();
        System.out.println(x + " в степени " + y + " = " + pow(x, y));
        scanner.nextLine();
        System.out.println();
    }

    public int numLen(long x) {
        x = Math.abs(x);
        if (x == 0) return 1;
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public void runTask3_5() {
        System.out.println("--- Задача 3.5: Количество цифр в числе ---");
        System.out.print("Введите целое число: ");
        while (!scanner.hasNextLong()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        long x = scanner.nextLong();
        System.out.println("Количество цифр: " + numLen(x));
        scanner.nextLine();
        System.out.println();
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("*".repeat(x));
        }
    }

    public void runTask3_7() {
        System.out.println("--- Задача 3.7: Квадрат из звёздочек ---");
        System.out.print("Введите размер стороны квадрата: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();
        System.out.println("Квадрат " + x + "x" + x + ":");
        square(x);
        scanner.nextLine();
        System.out.println();
    }

    public void guessGame() {
        int number = ThreadLocalRandom.current().nextInt(0, 10);
        int cnt = 0;
        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            int x = scanner.nextInt();
            cnt++;
            if (x == number) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + cnt + " попытки");
                break;
            } else {
                System.out.println("Вы не угадали, попробуйте ещё раз.");
            }
        }
    }

    public void runTask3_10() {
        System.out.println("--- Задача 3.10: Игра Угадайка ---");
        guessGame();
        System.out.println();
        scanner.nextLine();
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    public void runTask4_3() {
        System.out.println("--- Задача 4.3: Максимальное по модулю ---");
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + arrayToString(arr));
        System.out.println("Максимальное по модулю: " + maxAbs(arr));
        scanner.nextLine();
        System.out.println();
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + (i - pos)] = arr[i];
        }
        return result;
    }

    public void runTask4_5() {
        System.out.println("--- Задача 4.5: Вставка массива в массив ---");
        System.out.print("Введите размер массива arr: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент arr: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите размер массива ins: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int m = scanner.nextInt();
        int[] ins = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент ins: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            ins[i] = scanner.nextInt();
        }

        System.out.print("Введите позицию вставки pos (начиная с 0): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int pos = scanner.nextInt();

        int[] result = add(arr, ins, pos);
        System.out.println("Результат: " + arrayToString(result));
        scanner.nextLine();
        System.out.println();
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public void runTask4_6() {
        System.out.println("--- Задача 4.6: Реверс массива ---");
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.println("До реверса:   " + arrayToString(arr));
        reverse(arr);
        System.out.println("После реверса: " + arrayToString(arr));
        scanner.nextLine();
        System.out.println();
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public void runTask4_8() {
        System.out.println("--- Задача 4.8: Объединение двух массивов ---");
        System.out.print("Введите размер массива arr1: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент arr1: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Введите размер массива arr2: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент arr2: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            arr2[i] = scanner.nextInt();
        }

        int[] result = concat(arr1, arr2);
        System.out.println("Результат: " + arrayToString(result));
        scanner.nextLine();
        System.out.println();
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public void runTask4_9() {
        System.out.println("--- Задача 4.9: Все вхождения числа ---");
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Нужно целое число.");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите искомое число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Нужно целое число.");
            scanner.next();
        }
        int x = scanner.nextInt();

        int[] result = findAll(arr, x);
        if (result.length == 0) {
            System.out.println("Число " + x + " не найдено в массиве.");
        } else {
            System.out.println("Индексы вхождения числа " + x + ": " + arrayToString(result));
        }
        scanner.nextLine();
        System.out.println();
    }

    public String arrayToString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        Main lab = new Main();
        lab.run();
    }
}
