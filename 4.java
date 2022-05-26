import java.util.Scanner;
public class job4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        String b;
        System.out.println("Введіть перше ім'я ");
        if (sc.hasNextLine()) {
            a = sc.nextLine();
        } else {
            System.out.println("Помилка!");
            return;
        }
        System.out.println("Введіть друге ім'я");
        if (sc.hasNextLine()) {
            b = sc.nextLine();
        } else {
            System.out.println("Помилка!");
            return;
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Перевірка пройшла успішно!");
        }else {
            System.out.println("Помилка перевірки!");
        }
    }
}
