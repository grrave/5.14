import java.util.Scanner;
public class job3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кількість цифр які потрібно порівняти?");
        int numbersLength;
        if (sc.hasNextInt()) {
            numbersLength = sc.nextInt();
            if (numbersLength <= 0) {
                return;
            }
        }else {
            System.out.println("Дані введено не вірно");
            return;
        }
        double[] numbers = new double[numbersLength];
        System.out.println("Введіть дробове число");
        for (int a = 0; a < numbersLength; a++) {
            System.out.println("Введіть число №" + (a + 1) + ":");
            if (sc.hasNextDouble()) {
                numbers[a] = sc.nextDouble();
            }else {
                System.out.println("Дані введено не вірно");
                return;
            }
        }
        double largestNumber = 0;
        for (int b = 0; b < numbersLength; b++) {
            if (numbersLength == 1) {
                System.out.println(numbers[b] + " найбільше з введених вами чисел!");
                return;
            }
            int j = b + 1;
            if (j == numbersLength) {
                j = 0;
            }
            if (numbers[b] > numbers[j]) {
                largestNumber = numbers[b];
            }
        }
        System.out.println(largestNumber + " найбільше з введених вами чисел!");
    }
}
