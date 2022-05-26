import java.util.Scanner;
public class job5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        String y;
        System.out.println("Введіть перше слово");
        if (sc.hasNextLine()) {
            x = sc.nextLine();
        } else {
            System.out.println("Помилка!");
            return;
        }
        System.out.println("Введіть друге слово");
        if (sc.hasNextLine()) {
            y = sc.nextLine();
        } else {
            System.out.println("Помилка!");
            return;
        }
        if (x.length() > y.length()) {
            System.out.printf("Слово '%s' більше за слово '%s'", x, y);
        }else if (x.length() < y.length()) {
            System.out.printf("Слово '%s' більше за слово '%s'", y, x);
        }else {
            System.out.printf("Слова '%s' і '%s' мають однакову довжину", x, y);
        }
    }
}
