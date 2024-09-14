public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] pay = {50, 60, 30, 78, 123};
        int total = 0;
        for (int i = 0; i < pay.length; i++) {
            total += pay[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей%n", total);

        System.out.println();

        System.out.println("Задание 2");

        int[] pay1 = {37, 45, 14, 67, 343};
        if (pay1.length > 0) {
            int max = pay1[0];
            int min = pay1[0];
            for (int i = 0; i < pay1.length; i++) {
                if (max < pay1[i]) {
                    max = pay1[i];
                }
                if (min > pay1[i]) {
                    min = pay1[i];
                }
            }

            System.out.println("Минимальная сумма трат за неделю составила " +
                    min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        } else {
            System.out.println("Миксимального и минимального нет");
        }

        System.out.println();

        System.out.println("Задание 3");

        int[] pay2 = {234, 125, 567, 123, 6543};
        int total1 = 0;
        for (int i = 0; i < pay2.length; i++) {
            total1 += pay2[i];
        }
        double average = (double) total1 / pay2.length;
        System.out.printf("Сумма трат за месяц составила %.2f рублей%n", average);

        System.out.println();

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}