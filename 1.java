import java.util.Scanner;
public class job1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] words = {"перше", "друге", "третє", "четверте", "п'яте"};
            String b = "";
            for (int a = 0; a < 5; a++) {
                System.out.println("Введіть " + words[a] + " слово");
                if (sc.hasNextLine()) {
                    String temp = sc.nextLine();
                    b = b.concat(temp).concat(" ");
                }else {
                    System.out.println("Error, щось введено не вірно");
                }
            }
            System.out.println(b);
        }
}
