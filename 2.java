import java.util.Scanner;
public class job2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"перше слово", "друге слово", "третє слово", "четверте слово", "п'яте слово"};
        String a = "";
        for (int b = 0; b < 5; b++) {
            System.out.println("Введіть " + words[b] + " слово");
            if (sc.hasNextLine()) {
                String temp = sc.nextLine();
                a = a.concat(temp.substring(0, 1));
            }else {
                System.out.println("error");
            }
        }
        System.out.println(a);
    }
}
