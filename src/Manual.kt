import java.util.Scanner;
public class Manual {
    public static void main(String[] args) {
        System.out.print("Введите строку, которую нужно инвертировать: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        new ReverseStroki(s1);
    }
}